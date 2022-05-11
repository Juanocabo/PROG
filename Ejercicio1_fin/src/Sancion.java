
public class Sancion {

	String fecha,motivo;
	String importe;
	public Sancion(String fecha, String motivo, String importe) {
		this.fecha=fecha;
		this.motivo=motivo;
		this.importe=importe;
	}
	public Sancion(String entrada) {
		fecha=entrada.substring(entrada.indexOf(". "),entrada.indexOf("|"));
		entrada=entrada.substring(entrada.indexOf("|"),entrada.length());
		motivo=entrada.substring(0,entrada.indexOf("|"));
		entrada=entrada.substring(entrada.indexOf("|"),entrada.length());
		importe=entrada.substring(0,entrada.indexOf(";"));
	}
}
