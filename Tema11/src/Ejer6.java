import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args){

		boolean fin;
		Scanner t = new Scanner(System.in);
		Scanner read = null;

		do{
			System.out.println("Escribe el fichero en el que deseas buscar: ");
			String fichero = t.nextLine();
			fin=true;

			try {
				read = new Scanner(new BufferedReader(new FileReader(fichero)));
				System.out.println("Escribe la palabra de la que deseas saber su ocurrencia: ");
				String palabra = t.next();
				int contador=0;

				while(read.hasNext()) {
					if(palabra.toLowerCase().equals(read.next().toLowerCase()))++contador;
				}

				System.out.println("La palabra "+palabra+" sale: "+contador+((contador==1)?" vez":" veces"));

			}catch (FileNotFoundException e) {

				fin=false;
			}

		}while(!fin);

		read.close();
		t.close();

	}
}
