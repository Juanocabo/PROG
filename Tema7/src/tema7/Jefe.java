package tema7;

public class Jefe extends Empleado{
	String depto;
	
//	public Jefe(String nombre, int edad,float porcentaje,String depto) {
//		super(nombre,edad,porcentaje);
//		this.depto=depto;
//		sueldo=sueldobase*(porcentaje/100)+plusjefe;
//	}
	public void pedirdatos(String nombre, int edad,float porcentaje,String depto) {
		super.pedirdatos(nombre,edad,porcentaje);
		this.depto=depto;
		sueldo=sueldobase*(porcentaje/100)+plusjefe;
	}
	public void verEmp() {
		System.out.println(nombre+" "+edad+" "+porcentaje+" "+depto+" "+sueldo);
	}
}