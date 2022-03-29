package xdes;

public class qksort {
	static int[] l = {11,27,3,5,1,1000,300,125,86};
	public static void qsort(int ini, int fin) {
		int m=0;

		for(int i = ini+1;i<=fin;i++) {
			System.out.println(l[m]);
			if(l[m]>l[i]) {
				int j= i-1;
				int a = l[i];
				while(j>m && l[j]>a) {
					l[j+1]=l[j];
					j--;
				}
				l[m]=a;
				m=i;
				
			}
			
		}
	//	qsort(ini,m-1);
	//	qsort(m+1,fin);
		}
		
	public static void main(String[] args) {
		qsort(0, l.length-1);
	for(int i = 0 ; i<l.length;++i)System.out.println(l[i]);
	}

}
