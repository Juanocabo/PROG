package Tema74;

public final class Profesor extends Persona {
	
	String dpto;
	int c_plus;
	class plus{
		String nombre;
		float cantidad=0;
		public plus() {
			nombre=tec.next();
			cantidad=tec.nextFloat();
		}
		public plus(int u) {
			nombre="";
			cantidad=0;
		}
	}
	plus[] pls;
	public Profesor() {
		pedirDatos();
		pls = new plus[c_plus];
		for(int i = 0 ; i<pls.length;++i) {
			pls[i] = new plus();
		}
	}
	public void pedirDatos() {
		nombre=tec.next();
		edad=tec.nextInt();
		c_plus=tec.nextInt();
	}
	@Override
	public void DevolverMasAlto() {
		plus mpls = new plus(1);
		for(int i = 0 ; i< pls.length;++i) {
			if(pls[i].cantidad>=mpls.cantidad)mpls=pls[i];
		}
		System.out.println(mpls.nombre+"-->"+mpls.cantidad);
	}

	@Override
	public void VisualListaValores() {
		System.out.println(nombre+" "+edad+":");
		for(int i = 0 ; i<pls.length;++i) {
			System.out.println(pls[i].nombre+"-->"+pls[i].cantidad);
		}
		
	}

}
