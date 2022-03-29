package ordenatodo;

public class SeleccionDirecta extends ListaOrdenable{

	public SeleccionDirecta(int[] m) {
		super(m);
	}


	public void ordenar() {
		int x;
		for(int i=0; i<m.length;i++){
			int menor=i;
			for(int j=i+1; j<m.length;j++){
				if(m[j]<m[menor]) menor=j;
			}
			if(i !=menor) {
				x=m[menor];
				m[menor]=m[i];	
				m[i]=x;
			}
		}


	}

}
