import java.util.Scanner;

public class Ejer02 {
	/**
	 * 
	 * @param P numero positivo
	 * @param Q numero positivo
	 * @return 1 si P teine mas divisores que Q, 2 si Q los tiene, 3 si tienen los mismos y 0 si no son validos
	 */
	static int comDiv(int P,int Q) {
		int i,c1 = 0,c2=0;
		if(P>=0 && Q>=0) {
		for(i=P;i>=1;--i) {
			if(P % i == 0) {
				++c1;
				}		
	}
		for(i=Q;i>=1;--i) {
			if(Q % i == 0) {
				++c2;
				}		
	}
		if(c1>c2)return 1;
		else if(c1<c2)return 2;
		else return 3;
		}
		else return 0;
	}
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.println("Introduce dos numeros para comparar el numero de divisores");
	int P=teclado.nextInt(),Q=teclado.nextInt(),n;
	switch(comDiv(P,Q)) {
	case 0 : System.out.println("numeros no validos");break;
	case 1 : System.out.println(P+" tiene mas divisores que "+Q);break;
	case 2 : System.out.println(Q+" tiene mas divisores que "+P);break;
	case 3 : System.out.println(P+" tiene el mismo numero de divisores que "+Q);break;
	}
	

	}

}
