/**
 * 
 */
package xdes;

/**
 * @author alu
 *
 */
public class dgfdgh {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] lista = {1,9,3,19,2};
			
			for(int i=0;i<lista.length;++i){
				int pos=0;
				int menor=lista[i];
				for(int j=i+1;j<lista.length;++j){
			if(lista[j]<menor) { menor=lista[j];pos=j;}
			
		}
		for(int k=pos-1;k>=i;--k)
					lista[k+1]=lista[k];

		lista[i]=menor;
		System.out.println(lista[i]);	
		}
		

	}}
