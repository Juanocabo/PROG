import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Mezclatxt {
/*
 * coge las lineas de los ficheros origen 1 y 2 y las intorduce en el fichero destino
 */
	public static void main(String[] args) throws IOException {
		String linea="";
		String linea2="";
		FileInputStream a=null;
		FileInputStream b=null;
		try {
			int c,d;
			File f = new File("src/origen1.txt");
			File f2 = new File("src/origen2.txt");
			a = new FileInputStream(f);
			b = new FileInputStream(f2);
			boolean o=true;
			while(o) {
				linea=linea2="";
			while ((c=a.read())!=-1 || c!=13) {
				linea+=(char)c;
			}
			while ((d=b.read())!=-1 || c!=13) {
				linea2+=(char)d;
			}
			PrintStream l = new PrintStream("src/destino");
			l.print(linea);
			l.print(linea2);
			}
			
		}finally {
			if(a!=null && b!=null) {
			a.close();
			b.close();
			}
		
		}
		

	}

}
