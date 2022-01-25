package Tema6;
import java.util.Scanner;
public class Comedor {
	Scanner tec = new Scanner(System.in);
	public class Menuelegido{
		private float cuenta;
		static Menu menu = new Menu();	
		Plato[] menele = new Plato[2];
		public  Menuelegido() {	
		menu.setCarta("salchicha","pan y salchichota",21);
		menu.setCarta("entrecot","filete",32);
		menu.setCarta("migas","migas chorizo",52);
		menu.setCarta("ensalada","lechuga",23);
		menu.setCarta("costillas con salsa de setas","costillas setas ajo",19);
		menu.verCarta();
		int primero=tec.nextInt(); 
		int segundo=tec.nextInt(); 
		elegir(primero,segundo);
		}
		public void elegir(int Primero,int Segundo) {				
			menele[0]=menu.carta[Primero-1];
			menele[1]=menu.carta[Segundo-1];
			setCuenta(menele[0].getPrecio()+menele[1].getPrecio());	
		}
		public float getCuenta() {
			return cuenta;
		}
		public void setCuenta(float cuenta) {
			this.cuenta = cuenta;
		}
	}
	
		String nombre;
		int m;
		Float debe=0f;
		public Comedor(String nombre) {
			this.nombre=nombre;
			System.out.println("Introduce el numero de menus que desea :");
			m=  tec.nextInt();
			Menuelegido[] serv = new Menuelegido[m];
			for(int i = 0; i < serv.length;++i) {
				serv[i] = new Menuelegido();
				debe+=serv[i].getCuenta();
				copia(serv);
			}	
		}
		Menuelegido[] serv = new Menuelegido[m];
		
		public void copia(Menuelegido[] serv1) {
			serv=serv1;
		}
		public void verCuenta() {
			for(int i = 0; i < serv.length;++i) {
				System.out.println(serv[i].getCuenta());
				
			}	
			System.out.println("Total : "+debe);
		}
	
	
	
	
	
	
	public static void main(String[] args) {
		Comedor hola = new Comedor("Juan");
		hola.verCuenta();
	}

}
