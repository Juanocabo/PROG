package xdes;

public class sdfhdgfh {

	public static void main(String[] args) {
		int x=0;
		int[] lista = {-2,11,9,8,7,45,5,4,3,2,1,0};
		int cantidad = lista.length;
		boolean ordenado;
		for(int i=0; i<cantidad;i++){
			for(int j=0; j<cantidad-(i+1);j++){
				if(lista[j]>lista[j+1]) { 
					x=lista[j];
					lista[j]=lista[j+1];	
					lista[j+1]=x;
				}
			}
		}

		for(int i = 0 ; i<lista.length;++i)System.out.println(lista[i]);

	}

}
