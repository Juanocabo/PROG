package Domino;

public class FichaJuego extends Ficha {
	//lados ocupados
	boolean ocupado1,ocupado2;
	
	public FichaJuego(char c, char d) {
		super(c, d);
		ocupado1=ocupado2=false;
		
	}
	public FichaJuego(int x, int y) {
		super(x, y);
		ocupado1=ocupado2=false;
		
	}
	
	public boolean compatible(FichaJuego compatible) {
		return( c1==compatible.c1 || c2==compatible.c2 
				|| c2==compatible.c1 || c1==compatible.c2);
			
	}

	public void casar(FichaJuego f) {
		if ( !compatible(f) )
			throw new IllegalArgumentException("Estas fichas no casan");
		if(c1==f.c1 && !ocupado1 && !f.ocupado1)
			ocupado1=f.ocupado1=true;
		else if(c2==f.c2 && !ocupado2 && !f.ocupado2)
			ocupado2=f.ocupado2=true;
		else if(c1==f.c2 && !ocupado1 && !f.ocupado2)
			ocupado2=f.ocupado2=true;
		else if(c2==f.c1 && !ocupado2 && !f.ocupado1)
			ocupado2=f.ocupado2=true;
		
	}
	
}
