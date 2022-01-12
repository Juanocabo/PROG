package tema52;
import java.util.Scanner;
public class Disco {
	Scanner tec = new Scanner(System.in);
private String titulo;
private int ncan,fecha;
private float precio;
public Disco() {}
public Disco(String titulo,int ncan,int fecha,float precio) {
	this.titulo=titulo;
	this.ncan=ncan;
	this.precio=precio;
	this.fecha=fecha;
}
public  String gTitulo(){
	return titulo;
}
public void sTitulo(String titulo){
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
public void sPreico(float precio){
	this.precio=precio;
}
public  int gFecha(){
	return fecha;
}
public void sFecha(int fecha){
	this.fecha=fecha;
}
}