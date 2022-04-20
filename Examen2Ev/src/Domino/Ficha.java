
package Domino;
/**
 * representacion de una ficha de domino
 * una ficha de domino tiene dos lados 
 * cada uno con valores del 1 al 6 o blanco
 * vamos a representear dichos vlaoraes con los caracteres ' '(blanco),
 * junto con el '1' al '6'.
 * @author alu
 *
 */
public class Ficha {
	protected char c1;
	protected char c2;
	private static final String VALIDOS=" 123456";
	//comprueba que el caracter es valido para la ficha
	private boolean valido(char x) {
		if(x>='1' && x<='6')
			return true;
		return x==' ';
		
	}
	
	
	public Ficha (char c,char d) {
		
		if(!(valido(c)&&valido(d)))
			throw new IllegalArgumentException("Caracter no valido");
		c1=c;c2=d;
		
	}
	
	public Ficha (int x, int y) {
		this(x==0?' ':(char)('0'+x),
				y==0?' ':(char)('0'+y));
		
	}
	
	
	public boolean equals( Ficha f ) {
		return( c1==f.c1 && c2==f.c2 
				|| c2==f.c1 && c1==f.c2);
		
	}
	
	public String toString() {
		return "["+c1+"|"+c2+"]";
		
	}
	
	
}
