package tema7;

public class clase implements interfaz {

	public static void main(String[] args) {
		interfaz in = new clase();
		interfaz in1 = new clase1();
		in.hola();
		in1.hola();
	}

	@Override
	public void hola() {
		System.out.println("hola");
		
	}

	@Override
	public void adios() {
		// TODO Auto-generated method stub
		
	}

}
