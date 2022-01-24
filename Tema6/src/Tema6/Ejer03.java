package Tema6;

import java.util.Arrays;

public class Ejer03 {
	
	public void Imp(int[]vector) {
		Arrays.sort(vector);
		System.out.println("el max es : "+vector[vector.length-1]+" el min es: "+vector[0]);
	}

	public static void main(String[] args) {
		Ejer03 imp = new Ejer03();
		int [] vector = new int [10];
		for(int i = 0;i<vector.length;++i) {
			vector[i]= (int)(Math.random()*10)+1;
			System.out.println(vector[i]);
		}
		imp.Imp(vector);
		

	}

}
