package xdes;

public class asdfas {

	public static void main(String[] args) {
		int x=0;
		int[] lista = {-2,11,9,8,7,45,5,4,3,2,1,0};
		int cantidad = lista.length;
		boolean ordenado=false;
		for(int i=0; i<cantidad-1;i++){
			ordenado=true;
			for(int j=i; j<cantidad-(i+1);j++){
				if(lista[j]>lista[j+1]) { 
					x=lista[j];
					lista[j]=lista[j+1];	
					lista[j+1]=x;
					ordenado=false;
				}
			}
			for(int j=cantidad-(i+1);j>i;j--) {
				if(lista[j-1]>lista[j]) { 
					x=lista[j];
					lista[j]=lista[j-1];	
					lista[j-1]=x;
					ordenado=false;
				}
			}
			if(ordenado==true)break;
		}

		for(int i = 0 ; i<lista.length;++i)System.out.println(lista[i]);

	}
}
