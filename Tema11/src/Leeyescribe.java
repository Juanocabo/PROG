import java.io.*;
/*
 * Lee el documento de texto primos
 */
public class Leeyescribe {

	public static void main(String[] args) throws IOException {
		String testo="";
		FileInputStream a=null;
		try {
			int c;
			File f = new File("src/primos.txt");
			a = new FileInputStream(f);
			
			while ((c=a.read())!=-1) {
				testo+=(char)c;
			}
			
		}finally {
			if(a!=null)
			a.close();
		
		}
		System.out.println(testo);
		
	}

}
