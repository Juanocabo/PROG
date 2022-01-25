package Tema6;

import tema5.Empleado;
import tema5.NombreAleatorios;

public class Ejer06 {
final int c=50;
	Empleado[] empresa = new Empleado[c];
	String [] nombres = new String[c];
	
	public Ejer06() {
	NombreAleatorios nombreAleatorios = new NombreAleatorios();
	nombres=nombreAleatorios.NomAl(c);
	for(int i = 0 ; i < empresa.length;++i) {
		empresa[i] = new Empleado(i,nombres[i]); 
		
		}
	}
	public void VerEmp() {
		for(int i = 0 ; i < empresa.length;++i) {
			System.out.println(empresa[i].gNemp()+" "+empresa[i].gNombre()); 
			
			}
	}
	
}