import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Mezclatxt {
	/*
	 * coge las lineas de los ficheros origen 1 y 2 y las intorduce en el fichero destino
	 */
	public static void main(String[] args) throws IOException {
		Scanner s=null;
		Scanner s2=null;
		String linea="";
		String linea2="";
		PrintStream out=null;
		//FileInputStream a=null;
		//FileInputStream b=null;
		try {
			s=new Scanner(new BufferedReader(new FileReader("src/origen1.txt")));
			s2=new Scanner(new BufferedReader(new FileReader("src/origen2.txt")));
			out = new PrintStream("src/destino.txt");
			boolean fin=false;
			while(!fin) {
				linea=linea2="";
				if(s.hasNext())linea=s.next();
				if(s2.hasNext())linea2=s2.next();
				out.append(linea+"\r"+linea2+"\r");
				if(!s.hasNext()&&!s2.hasNext())fin=true;
			}


		}finally {
			out.close();
		}

	}


}


