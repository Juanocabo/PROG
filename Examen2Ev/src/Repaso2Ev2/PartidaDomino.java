package Repaso2Ev2;

import java.util.Scanner;

public class PartidaDomino {

	public static void main(String[] args) {
			CajaDomino partida = new CajaDomino();
			Scanner s = new Scanner(System.in);
		/*	System.out.println("Cuantos jugadores juegan?");
			int num=s.nextInt();
			int j=0;
			int z;
			for(int i = 0 ; i<num;++i) {
				System.out.println("Jugador "+(i+1));
				int cantidad=j+28/num+((28%num!=0&&i==0)?28%num:0);
				for( z=j; z<cantidad+j;++z)
					System.out.print("--"+partida.getFicha(z)+((z==cantidad-2)?"\n":""));
				j=cantidad;
				}*/
			System.out.println(partida);
			

	}

}
