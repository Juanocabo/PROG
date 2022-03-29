package xdes;

public class shellmas {

	public static void main(String[] args) {
		int[] lista= {9,3,1,6,5,8,2,58,4};
		int [] h = {9,5,3,1};
		for(int k=0;k<h.length;k++){
			int m=h[k];
			for(int i =0;i<lista.length-m;i++) {
				int j=i;
				int aux = lista[i+m];
				while(j>=0 && lista[i]>aux) {
					lista[j+m]=lista[j];
					j-=m;
				}
				lista[j+m]=aux;
			}
		}
		for(int i = 0; i< lista.length-1 ; ++i)System.out.println(lista[i]);
	}

}
