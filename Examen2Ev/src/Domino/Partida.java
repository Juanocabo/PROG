package Domino;

public class Partida {

	public static void main(String[] args) {
		Domino o = new Domino();
		System.out.println(o);
		FichaJuego[] mias = new FichaJuego[7];
		for(int i =0; i<mias.length;++i)
			mias[i]=(FichaJuego) o.getFicha();
		for(int i =0; i<mias.length;++i)
		System.out.println(mias[i]);
	}

}
