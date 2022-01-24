package Tema6;

public class Ejer04 {
	
	public void coin(int [] vector1, int []vector2) {
		int cont=0;
		for(int i = 0;i<vector1.length;++i) {
			for(int j = 0;j<vector2.length;++j) {
				if(vector1[i]==vector2[j])++cont;
			}
			System.out.println(vector1[i]+" "+cont);
			cont=0;
		}
		
	}

	public static void main(String[] args) {
		Ejer04 coin = new Ejer04();
		int [] vector2 = new int [10];
		int [] vector1 = new int [10];
		for(int i = 0;i<vector1.length;++i) {
			vector1[i]= (int)(Math.random()*5)+1;
			System.out.println(vector1[i]);
		}
		for(int i = 0;i<vector2.length;++i) {
			vector2[i]= (int)(Math.random()*5)+1;
			System.out.println(vector2[i]);
		}
		coin.coin(vector1,vector2);
		
		
	}

}
