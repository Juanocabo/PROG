import java.util.Scanner;

public class Ejer07 {
	/**
	 * 
	 * @param r numero introducido
	 * @param o opcion de operacion(1 para circunferencia, 2 area, 3 volumen esfera)
	 * @return	0000 si los datos son erroneos
	 */
	
	public static double opRadio(int r, int o) {
		double resultado;
		final double pi = 3.14159;
		switch(o) {
		case 1 : resultado = 2*pi*r; break;
		case 2 : resultado = pi*r*r; break;
		case 3 : resultado = 4/3 *pi*r*r*r; break;
		default: resultado = 0000;
		}
		return resultado;
		
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce dos numeros, el primero sera el radio y el segundo podra ser(1 para circunferencia, 2 area, 3 volumen esfera)");
		int r=teclado.nextInt(),o=teclado.nextInt();
		System.out.println("El resultado de la opercaion elegida es: " + opRadio(r,o));

	}

}
