package ejer1;

public class Furgoneta extends Vehiculo  {
	
	public final int ejesf;
	
	public Furgoneta(int ejes) {
		ejesf=ejes;
		preciopint=500+100*ejes;
	}

	public int getEjes() {
		return ejesf;
	}

	public boolean debeRevisarse() {
		if(km>12000||dias>180)return true;
		else return false;
	}

}
