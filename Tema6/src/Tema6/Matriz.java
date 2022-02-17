package Tema6;

import java.util.Scanner;

public class Matriz {
	Scanner tec = new Scanner(System.in);
	int filas,columnas;
	int[][]matrix;
	public Matriz(int filas,int columnas) {
		this.filas=filas;
		this.columnas=columnas;
		matrix = new int[filas][columnas];
		for(int i = 0; i<filas;++i) {
			for(int j = 0;j<columnas;++j) {
				matrix[i][j]=tec.nextInt();
			}}

	}
	public Matriz(int filas,int columnas,boolean met) {
		this.filas=filas;
		this.columnas=columnas;
		matrix = new int[filas][columnas];
		for(int i = 0; i<filas;++i) {
			for(int j = 0;j<columnas;++j) {
				matrix[i][j]=0;
			}}

	}

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
		System.out.println();
		for(int i = 0; i<filas;++i) {
			for(int j = 0;j<columnas;++j) {
				System.out.print(matrix[i][j]+" ");
				if(j==columnas-1)System.out.println();
			}

		}
	}
	public Matriz sum( Matriz matri) {
		Matriz vector3 = new Matriz(filas,columnas,true);
		for(int i = 0; i<filas;++i) {
			for(int j = 0;j<columnas;++j) {
				vector3.matrix[i][j]=matrix[i][j]+matri.matrix[i][j];

			}

		}
		return vector3;

	}
	public Matriz res( Matriz matri) {
		Matriz vector3 = new Matriz(filas,columnas,true);
		for(int i = 0; i<filas;++i) {
			for(int j = 0;j<columnas;++j) {
				vector3.matrix[i][j]=matri.matrix[i][j]-matrix[i][j];

			}

		}
		return vector3;

	}
	public Matriz mul( Matriz matri) {
		Matriz vector3 = new Matriz(filas,columnas,true);
		for(int i = 0; i<vector3.matrix.length;++i) {
			int a=0;
			for(int j = 0;j<vector3.matrix[i].length;++j) {
				for(int z=0;z<columnas;++z) {
					vector3.matrix[i][j]+=matrix[i][z]*matri.matrix[z][j];
				}


			}

		}
		return vector3;

	}


}
