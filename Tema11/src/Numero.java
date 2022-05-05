
public class Numero implements Comparable<Numero>{
 int n;
 Numero(int n){
	 this.n=n;
 }
public int compareTo(Numero o) {
	if(n==o.n)
	return 0;
	else if(n<o.n)
	return -1;
	else return 1;
}
}
