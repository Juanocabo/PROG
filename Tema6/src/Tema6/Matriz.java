package Tema6;

import java.util.Scanner;

public class Matriz {
	Scanner tec = new Scanner(System.in);
	int filas,columnas;
	public Matriz(int filas,int columnas) {
		 this.filas=filas;
		 this.columnas=columnas;
		}
	public Matriz() {
	 filas = tec.nextInt();
	 columnas = tec.nextInt();
	}
	int[][] matrix = new int[filas][columnas];
	public int Filas() {
		return filas;
	}
	public int Columnas() {
		return columnas;
	}
	public void Celda(int f,int c) {
		matrix[f][c]=tec.nextInt();
	}
	public void Imprimir() {
		for(int i = 0; i<filas;++i) {
			for(int j = 0;j<columnas;++j) {
				System.out.print(matrix[i][j]+" ");
				if(filas%i==0)System.out.println();
			}
			
		}
	}
	public Matriz sum( Matriz matri) {
		Matriz vector3 = new Matriz(filas,columnas);
		for(int i = 0; i<filas;++i) {
			for(int j = 0;j<columnas;++j) {
				vector3.matrix[i][j]=matrix[i][j]+matri.matrix[i][j];
				
			}
			
		}
		return vector3;
		
	}
}
