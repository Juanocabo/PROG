
import java.util.HashMap;


public class Opcionesrpssl{
	static HashMap<Integer, String> op = new HashMap<Integer, String>();
	static int tu,maquina;
	public Opcionesrpssl(){
		
		op.put(1, "piedra");
		op.put(2, "papel");
		op.put(3, "tijera");
		op.put(4, "spok");
		op.put(5, "lagarto");
	}
	static public Integer resta(Integer a,int b) {
		if(a-b<=0)return(a-b)+op.size();
		return a-b;
		
	}
	static public Integer suma(Integer a,int b) {
		if(a+b>5)return(a+b)-op.size();
		return a+b;
		
	}
	public String getMarcador() {
		return "__________________\n|TU \t MAQUINA| \n|"+tu+"\t       "+maquina+"|\n__________________";
	}
	public void marcaRonda(Integer a,Integer b) {
		if(a==b)return;
		int i = 2;
		while(i<op.size()/2) {
			if(suma(a,i)==b)++tu;
			if(resta(a,i)==b)++maquina;
			i+=2;
		}
	}
	
	public String matoPierdo(Integer a,Integer b) {
		int i = 2;
			while(i<=(op.size()/2)*2) {
				if(suma(a,i)==b)return" ganas";
				if(resta(a,i)==b)return" pierdes";
				i+=2;
			}
		return" empate";
		
	}

}
