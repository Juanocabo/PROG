package tema52;

import java.util.Scanner;

public class CuentaCorriente {
	static Scanner tec = new Scanner(System.in);
	private String titular,codigo;
	static String codigos="";
	float saldo;
	boolean valido;
	public CuentaCorriente(String codigo,String titular) {
		if(codigos.indexOf(codigo)<0) {
		codigos=codigos+" "+codigo;
		this.codigo = codigo;
		this.titular = titular;
		saldo = 0; 
		valido=true;} 
		else valido=false;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public void IngresarDinero() {
		if(valido==true) {
		System.out.println("Dinero que desea ingresar: ");
		float m = tec.nextFloat();
		setSaldo(saldo + m);}
		else System.out.println("Esta cuenta no existe");
	}
	public void RetiraDinero() {
		if(valido==true) {
		System.out.println("Cantidad que desea retirar de su cuenta: ");
		float m = tec.nextFloat();
		if(PuedoSacar(m))setSaldo(saldo - m);
		else { 
		String l = tec.nextLine();
		System.out.println("La cuenta no posee suficientes fondos para retirar esa cantidad, porfavor pulse return");
		l = tec.nextLine();}
		System.out.println("Esta cuenta no existe");
		}

	}
	public boolean PuedoSacar(float m) {
		if (saldo>=m)return true;
		else return false;
	}
}
