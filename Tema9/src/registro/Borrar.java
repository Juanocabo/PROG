package registro;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Borrar {
	String tempo="passwd_temp.txt";
	String fichero;
	Scanner s = null;
	boolean add = true;
	
	public Borrar ( String archivo ) {
		fichero = archivo;
		
		//System.out.println("Abro fichero: " + fichero);
		try {
			s = new Scanner(
					new BufferedReader(
							new FileReader(fichero)));
		} catch (FileNotFoundException e1) {
			add = false;
			System.out.println("fichero no encontrado");
		}
	}
	public boolean comprobarUsuario ( String nombre ) {
		if ( s == null )
			return false;
		boolean encontrado = false;
		// System.out.println("Compruebo nombre de usuario en archivo");
		while ( ! encontrado && s.hasNext() ) {
			String usuario = s.next();
			if ( nombre.equals(usuario) )
				return true;
			s.nextLine();
		}
		return false;
	}
	public void borrar(String nombre) {
		String n;
		String p;
		PrintStream ps = null;
		s.reset();
		try {
			try {
				ps = new PrintStream(
						new FileOutputStream(tempo,add));
			} catch (FileNotFoundException e){}
			while(s.hasNext()) {
				if(!(n=s.next()).equals(nombre)) {
					p=s.next();
				ps.println(n+" "+p);
				}
			}
			
		} finally {
			ps.close();
			s.close();
		}
		try {
			s = new Scanner(
					new BufferedReader(
							new FileReader(tempo)));
			ps = new PrintStream(
					new FileOutputStream(fichero));
	
		} catch (FileNotFoundException e) {}
			while(s.hasNext()) {
				s.next();
			}
			
	}
	
}
