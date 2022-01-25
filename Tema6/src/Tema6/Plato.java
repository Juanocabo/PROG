package Tema6;

public class Plato {
	private String Ingredientes,Nombre;
	private float precio;
public Plato() {
	setNombre("Hambre");
	Ingredientes="Ajo pan y vino";
	precio=100;
}
public Plato(String Nombre,String Ingredientes,float precio) {
	this.Ingredientes=Ingredientes;
	this.precio=precio;
	this.setNombre(Nombre);
}
public float getPrecio() {
	return precio;
}
public void setPrecio(float precio) {
	this.precio = precio;
}
public String getIngredientes() {
	return Ingredientes;
}
public void setIngredientes(String ingredientes) {
	Ingredientes = ingredientes;
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
}
