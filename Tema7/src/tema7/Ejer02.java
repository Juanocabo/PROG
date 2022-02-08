package tema7;

public class Ejer02 {
	public class Empleado{
		private int sueldo;
		String nombre;
		protected String direccion;
		public int edad;
		}
	public class Jefe extends Empleado{
		EmpleadoEspecial hola;
		public Jefe(){
			super();
			hola=new EmpleadoEspecial();
		}
		}
	public class EmpleadoEspecial{
		public String nombreEs;
		private float sueldoEs;
		protected String direccionEs;
		int edad;
		}
	public class JefeEspecial extends EmpleadoEspecial{
	public JefeEspecial(){
		super();
	}
	}
}
