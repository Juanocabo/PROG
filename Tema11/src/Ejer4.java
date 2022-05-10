import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejer4 {

	public static void main(String[]args) throws IOException{
		ArrayList<String> words = new ArrayList<String>();
		System.out.println("Escribe la direccion del fichero que deseas ordenar alfabeticamente");
		Scanner tec = new Scanner(System.in);
		String fichero = tec.nextLine();
		Scanner read = null;
		PrintStream write = null;
		try {
				read=new Scanner(new BufferedReader(new FileReader(fichero)));
				if(read.hasNext()) {
					write= new PrintStream(new FileOutputStream(fichero.substring(0,fichero.indexOf(".txt"))+"_sort",false));
					while(read.hasNext()) {
						words.add(read.next());
					}
					Collections.sort(words);
					for(String x:words) {
						write.println(x);
					}
				}
		}finally {
			write.close();
			read.close();
			tec.close();
		}
	}
}