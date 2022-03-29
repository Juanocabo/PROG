package xdes;

public class shell {

	public static void main(String[] args) {
		int[] lista = {132,-2,11,9,8,7,45,5,4,3,2,1,0,124};
		int[] numeros = {9,5,3,1};
		int salto;
		boolean ordenado;
		for(int i=0;i<numeros.length;i++) {
			salto=numeros[i];
			ordenado=true;
			while(ordenado) {
				ordenado=false;
				for(int j=0;j+salto<lista.length;j++) {
					if(lista[j]>lista[j+salto]) {
						int x=lista[j];
						lista[j]=lista[j+salto];
						lista[j+salto]=x;
						ordenado=true;
					}
				}
			}
		}
		for(int i=0;i<lista.length;++i)System.out.println(lista[i]);
	}

}
