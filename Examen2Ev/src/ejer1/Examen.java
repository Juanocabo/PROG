package ejer1;

public class Examen {

	public static void main(String[] args) {

		final int VEHICULOS = 1000000;
		Vehiculo[] v = new Vehiculo[VEHICULOS];
		for(int i = 0; i < 1000000; i++) {
			int tipoVehiculo = (int)(Math.random()*3);
			int ejes;
			if(tipoVehiculo == 0) {
				v[i] = new Automovil();}
			else if (tipoVehiculo == 1) {
				ejes = (int)(Math.random() * 2) + 2;
				v[i] = new Furgoneta(ejes);}
			else {
				ejes = (int)(Math.random() * 3) + 4;
				v[i] = new Camion(ejes);
			}
			if(Math.random() >= 0.5)
				v[i].pintar((int)(Math.random() * Vehiculo.colorbase) + 1);
		}

		for(int i = 0; i < 1000000; i++) {
			String salida="";
			if(v[i] instanceof Automovil)
				salida = "Automovil\t";
			else if(v[i] instanceof Furgoneta)
				salida = "Furgoneta\t";
			else 
				salida = "Camion   \t";
				salida += v[i].getEjes()+"\t";
			if(v[i].getColor() != Vehiculo.colorbase)
				salida += v[i].getColor()+"       \t"+v[i].precioPintura()+"�";
			System.out.println(salida);
		}

	}

}
