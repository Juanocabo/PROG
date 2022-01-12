package tema52;

public class Disco {
	char titulo;
	int ncan,fecha;
	double precio;
public  char gTitulo(){
	return titulo;
}
public void sTitulo(char titulo){
	this.titulo=titulo;
}
public int gNCanciones() {
	return ncan;
}
public void sNCanciones(int ncan) {
	this.ncan=ncan;
}
public  double gPrecio(){
	return precio;
}
public void sPreico(double precio){
	this.precio=precio;
}
public  int gFecha(){
	return fecha;
}
public void sFecha(int fecha){
	this.fecha=fecha;
}
}