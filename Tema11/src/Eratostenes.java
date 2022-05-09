
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.TreeSet;
/*
 * mirar el documento de texto primos.txt
 */
public class Eratostenes {

	public static void main(String[] args) throws IOException {
		TreeSet<Integer> nums = new TreeSet<Integer>();
		TreeSet<Integer> tachados= new TreeSet<Integer>();
		for(int i = 2;i<=500;++i) {
			nums.add(i);
		}
		for(Integer x:nums) {
			if(tachados.add(x)==true) {
				tachados.remove(x);
		for(Integer y:nums) {
			if(tachados.add(y)) {
			if(x==y)tachados.remove(y);
			else if(y%x==0)tachados.add(y);
			else tachados.remove(y);
			}
		if(x*x>=500)break;
		}
		}
			}
		File f;
		try {
			f=new File("src/primos.txt");
			PrintStream out = new PrintStream(f);
		nums.removeAll(tachados);
		for(Integer x:nums) {
			out.print(x+" ");
			//System.out.print(x+" ");
		}
		}finally {
		
		}
	}

}
