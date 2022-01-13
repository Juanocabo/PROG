package tema52;
import java.util.Scanner;
public class ConductorCuenta {
	

	public static void main(String[] args) {
		Scanner tec=new Scanner(System.in);
		String titular,codigo;
		System.out.println("Introduce el titular de la cuenta");
		titular = tec.next();
		System.out.println("Introduce el codigo de la cuenta");
		codigo = tec.next();
		CuentaCorriente cuenta = new CuentaCorriente(codigo,titular);
		System.out.println(cuenta.getCodigo()+cuenta.getTitular()+cuenta.getSaldo());
		cuenta.IngresarDinero();
		System.out.println(cuenta.getSaldo());
		System.out.println(cuenta.valido);
		cuenta.RetiraDinero();
		System.out.println(cuenta.getCodigo()+cuenta.getTitular()+cuenta.getSaldo());
	}

}
