import java.util.Scanner;

public class Sorteo {
static Scanner tec = new Scanner(System.in);
	
	public static void main(String[] args) {
		int premio=0;
		System.out.println("numero de partipantes: (cada uno pagara 2€ por participar)");
		int num = tec.nextInt();
		persona[] lista = new persona[num];
		for(int i = 0; i<lista.length;++i) {
			lista[i]=new persona();
			premio+=2;
		}
		int resultado;
		resultado = (int)(Math.random()*num+1);
		persona ganador= new persona(true);
		for(int i = 0; i<lista.length;++i) {
			if(lista[i].id==resultado)ganador=lista[i];
		}
		System.out.println("El ganador es: "+ganador.nombre+"\r\n"+"Y gana: "+premio+"€");
	}

}
