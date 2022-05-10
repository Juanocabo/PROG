
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner tec = new Scanner(System.in);
		boolean java = false;
		String fichero="";
		String aux;
		do {
			System.out.println("escribe el documento .java qeu deseas descomentar");
			fichero = tec.next();
			if(fichero.endsWith(".java"))java=true;
		}while(!java);
		Scanner read = new Scanner(new BufferedReader(new FileReader(fichero)));
		PrintStream write = new PrintStream(new FileOutputStream(fichero.substring(0,fichero.indexOf(".java"))+"v2.java"));
		while(read.hasNext()) {
			aux=read.nextLine();
			if(!aux.contains("//")&&!aux.contains("/**")&&!aux.contains("*")&&!aux.contains("*/"))write.println(aux);
		}
	}

}