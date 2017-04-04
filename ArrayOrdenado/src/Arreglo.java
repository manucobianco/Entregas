public class Arreglo {
	
	int[] elementos;
	int cantidad = 0;
	
	public Arreglo(int tamanio){
		elementos = new int[tamanio];
	}
	
	public void add(int i){
		elementos[cantidad] = i;
		cantidad++;
	}
	
	public void merge(){
		Mergesort aux = new Mergesort(elementos);
	}
	
	public void burbujeo(){
		int i, j, aux;
		
		for(i=0; i<elementos.length-1; i++){
			for(j=0; j<elementos.length-i-1; j++){
				if(elementos[j+1] < elementos[j]){
					aux = elementos[j+1];
					elementos[j+1] = elementos[j];
					elementos[j] = aux;
				}
			}
		}		
	} 
	
	public int getAt(int i){
		return elementos[i];
	}
}