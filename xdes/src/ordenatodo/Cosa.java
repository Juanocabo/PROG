package ordenatodo;

import java.util.Random;

public class Cosa implements Comparable{
	int num;
Cosa(){
	Random r = new Random();
	num=r.nextInt(1000000)+1;
	}
	
	public int compareTo(Object o) {
		return 0;
	}

}
