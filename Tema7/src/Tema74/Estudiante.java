package Tema74;

public final class Estudiante extends Persona{
	int nasi;
	class asignaturas{
		String nombre;
		float nota;
		public asignaturas(){
			nombre=tec.next();
			nota=tec.nextFloat();
		}
		public asignaturas(int u){
			nombre="";
			nota=0;
		}
		
	}
	asignaturas[] asig;
	public Estudiante() {
		pedirDatos();
		asig = new asignaturas[nasi];
		for(int i = 0 ; i<asig.length;++i) {
			asig[i] = new asignaturas();
		}
	}
	public void pedirDatos() {
		nombre=tec.next();
		edad=tec.nextInt();
		nasi=tec.nextInt();
	}
	@Override
	public void DevolverMasAlto() {
		asignaturas mnota = new asignaturas(1);
		for(int i = 0 ; i< asig.length;++i) {
			if(asig[i].nota>=mnota.nota)mnota=asig[i];
		}
		System.out.println(mnota.nombre+"-->"+mnota.nota);
		
	}

	@Override
	public void VisualListaValores() {
		System.out.println(nombre+" "+edad+":");
		for(int i = 0 ; i<asig.length;++i) {
			System.out.println(asig[i].nombre+"-->"+asig[i].nota);
		}
		
	}

}
