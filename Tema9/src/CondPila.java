import java.util.Random;

public class CondPila {

	public static void main(String[] args) {
		Pila p = new Pila();
		Random r=new Random();
		for(int i = 0; i<100;++i) {
			int a=r.nextInt(40)+1;
			if(a<=20) {
				int b=r.nextInt(20)+1;
				p.push(b);
				System.out.println("se mete: "+b);
			}
			
			else { 
				if(p.vacia==false)
				System.out.println("se saca: "+p.pop()); 
				}
		}
		System.out.println("tamaño 1 :"+p.size());
		int m=p.size();
		for(int i =0;i<m;++i) {
			System.out.println(p.pop());
		}
	}

}
