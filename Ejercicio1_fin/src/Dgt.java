import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Dgt {

	ArrayList<Vehiculos> coches= new ArrayList<Vehiculos>();
	boolean add=true;
	Scanner in=null;
	PrintStream out=null;
	String fichero;
	String tmp="temp.txt";
	public Dgt(String fichero) {
		
		this.fichero=fichero;
		if(abrirFichero())System.out.println("todo bien");
		for(Vehiculos x : coches) {
			System.out.println(x);
		}
		
	}
	/**
	 * 
	 * @return false si no existe el fichero y true sisi despues de guardar todos los vehiculos
	 */
	public boolean abrirFichero() {
		try {
		in = new Scanner(new BufferedReader(new FileReader(fichero)));
		}catch (FileNotFoundException e) {
			add=false;
		}
		if(in.hasNext()) {
			while(in.hasNextLine()) {
				if(!coches.add(new Vehiculos(in.nextLine())))System.out.println("no se mete");
			}
		}
		else System.out.println("No hay vehiculos registrados");
		return add;
	}
	
	public void añadirVehiculo(String matricula, String marca, String modelo, String propietario, String año) {
		
		coches.add(new Vehiculos(matricula,marca,modelo,propietario,año));
	}
	
	public void añadirSancion(String matricula,String fecha, String motivo, String importe) {
		
		for( Vehiculos x : coches) {
			if(x.matricula.equals(matricula))x.multas.add(new Sancion(fecha,motivo,importe));
		}
	}
	
	public void commit() {
		if(in!=null)
			in.close();
		if(out!=null)
			out.close();
		
		try {
			out = new PrintStream(new FileOutputStream(tmp,false));
		} catch (FileNotFoundException e) {}
		
		for(Vehiculos x : coches) {
			out.println(x);
		}
		out.close();
		try {
			out = new PrintStream(new FileOutputStream(fichero,false));
			in = new Scanner(new BufferedReader(new FileReader(tmp)));
		} catch (FileNotFoundException e) {}
		
		while(in.hasNext()) {
			out.println(in.nextLine());
		}
	}
	
	public void eliminarVehiculo(String matricula) {
		
		for(Vehiculos x : coches) {
			if(x.matricula==matricula && x.multas.isEmpty())coches.remove(x);
			if(x.matricula==matricula && !x.multas.isEmpty())System.out.println(x.multas.size());
		}
	}
	
	public void consultaSanciones(String matricula) {
		
		int cont=0;
		for(Vehiculos x : coches) {
			if(x.matricula.equals(matricula) ) {
				++cont;
				if(!x.multas.isEmpty()) {
					
				for(Sancion y : x.multas) {
					
					System.out.println(y.fecha+"-"+y.importe+"-"+y.motivo);
				}
				}
				else System.out.println("no tiene multas");
			}
			
		}
		if(cont==0)System.out.println("no existe un vehiculo con esta matricula");
	}
	
	public void quitarSanciones(String matricula) {
		
		for(Vehiculos x : coches) {
			if(x.matricula.equals(matricula) && !x.multas.isEmpty()) {
				System.out.println("eliminando sanciones");
				x.multas.clear();
			}
		}
	}
	
	public void vehiculosCon(int i) {
		
		for(Vehiculos x : coches) {
			if(x.multas.size()>=i)System.out.println(x);
			
		}
	}
	
	
}