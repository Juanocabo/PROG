package Tema6;

import java.util.Arrays;

public class Conjunto {
public int[] tabla = new int[100];
int cont = 0;
public Conjunto() {}
public void agregar(int n) {
	boolean valido=true;
	for(int i = 0 ; i<cont && valido == true;++i) {
		if(tabla[i]==n)valido= false;
	}
	if(valido==true) {
		tabla[cont]=n;
		++cont;
	}
	else System.out.println("Este numero ya pertenece al conjunto");
	
}
public void vaciar() {
	Arrays.fill(tabla, 0);
}
public void eliminar(int posicion) {
	for(int i=posicion+1;i<tabla.length;++i) {
		tabla[i-1]=tabla[i];
	}
}
public void copiar(int[] tabla2) {
	for(int i = 0;i<tabla.length;++i){
		tabla2[i]=tabla[i];
	}
}
public boolean esMiembro(int n) {
	boolean miem=false;
	for(int i = 0;i<tabla.length && miem==false;++i){
		if(n==tabla[i])miem=true;
	}
	return miem;
}
public int posicion(int n) {
	int f=-1;
	for(int i = 0;i<tabla.length;++i){
		if(n==tabla[i])f=i;
	}
	return f;
}
public boolean esIgual(int[]tabla1) {
	boolean igual=true;
	for(int i = 0;i<tabla.length && igual==true;++i){
		if(tabla1[i]!=tabla[i])igual=false;
	}
	return igual;
}
public void imprimir() {
	for(int i = 0;i<tabla.length;++i) {
		if(i%10==0)System.out.println();
		System.out.print(tabla[i]+" ");
	}
	System.out.println();
}
}