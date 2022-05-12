import java.util.ArrayList;

/**
 * 
 * @author juan porque david no hace nada
 *	Matrícula: cadena formada por cuatro números dígitos y tres letras consonantes
 *		(Nota: las letras consonantes no incluyen la eñe y la cu.)
 *	Marca
 *	Modelo
 *	Propietario
 * Año de matriculación
 */
public class Vehiculos{

	String matricula,marca,modelo,propietario,año;
	ArrayList<Sancion> multas = new ArrayList<Sancion>();
	public Vehiculos(String matricula, String marca, String modelo, String propietario, String año){
		
		this.matricula=matricula;
		this.marca=marca;
		this.modelo=modelo;
		this.propietario=propietario;
		this.año=año;
	}
	public Vehiculos(String entrada) {
		
		gnirtSot(entrada);
	}
	
	public String toString() {
		String salida=matricula+":"+marca+":"+modelo+":"+propietario+":"+año+":";
		int i=1;
		for (Sancion x : multas) {
			salida+=x;//(i++)+"."+x.fecha+"|"+x.motivo+"|"+x.importe+";";
		}
		return salida;
		
	}
	
	public void addSancion(String fecha, String motivo, String importe) {
		
		multas.add(new Sancion(fecha,motivo,importe));
	}
	
	public void gnirtSot(String entrada) {
		
		matricula=entrada.substring(0,entrada.indexOf(":"));
		entrada=entrada.substring(entrada.indexOf(":")+1,entrada.length());
		marca=entrada.substring(0,entrada.indexOf(":"));
		entrada=entrada.substring(entrada.indexOf(":")+1,entrada.length());
		modelo=entrada.substring(0,entrada.indexOf(":"));
		entrada=entrada.substring(entrada.indexOf(":")+1,entrada.length());
		propietario=entrada.substring(0,entrada.indexOf(":"));
		entrada=entrada.substring(entrada.indexOf(":")+1,entrada.length());
		año=entrada.substring(0,entrada.indexOf(":"));
		entrada=entrada.substring(entrada.indexOf(":"),entrada.length());
		if(entrada.indexOf(";")>=0) {
			while(entrada.indexOf(";")<=entrada.lastIndexOf(";") && entrada.indexOf(";")>0) {
			multas.add(new Sancion(entrada.substring(0,entrada.indexOf(";")+1)));
			entrada=entrada.substring(entrada.indexOf(";")+1,entrada.length());
			}
		}
	}
}