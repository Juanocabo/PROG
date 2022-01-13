package tema52;

public class Indicador {
	private float valor;
public Indicador(float valor) {	
	this.valor=valor;
}
public float getValor() {
	return valor;
}
public void setValor(float valor) {
	this.valor = valor;
}
public void VarValor(float vari ) {
	setValor(valor+vari);
}
public void ModValor(float vari ) {
	setValor(vari);
}
public void VerValor() {
	System.out.println(getValor());
}
}
