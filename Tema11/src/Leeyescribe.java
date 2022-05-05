import java.io.*;

public class Leeyescribe {

	public static void main(String[] args) throws IOException {
		String testo="";
		FileInputStream a=null;
		DataOutputStream u= null;
		try {
			int c;
			File f = new File("D:/Documentos/david.txt");
			a = new FileInputStream(f);
			
			while ((c=a.read())!=-1) {
				testo+=(char)c;
			}
			
		}finally {
			if(a!=null)
			a.close();
		
		}
		System.out.println(testo);
		u = new DataOutputStream( new BufferedOutputStream(new FileOutputStream("D:/Documentos/david.txt")));
		
		u.writeUTF(testo);
		u.flush();
		u.close();
	}

}
