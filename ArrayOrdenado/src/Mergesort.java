public class Mergesort {
	private int[] arreglo;
	private int[] arregloAux;
	private int cantidadElementos;

	public Mergesort(int[]arr){
		sort(arr);
	}
	
	public void sort(int[] arr) {
		this.arreglo = arr;
		cantidadElementos = arr.length;	
		this.arregloAux = new int[cantidadElementos];	
		mergesort(0, cantidadElementos - 1);
	}

	private void mergesort(int primero, int ultimo) {
		if (primero < ultimo) {
			int medio = (primero + ultimo) / 2;
			
			mergesort(primero, medio);
			mergesort(medio + 1, ultimo);
			
			merge(primero, medio, ultimo);
		}
	}
	
	private void merge(int primero, int medio, int ultimo) {

		for (int i = primero; i <= ultimo; i++) {			
			arregloAux[i] = arreglo[i];
		}
		
		int i = primero;
		int j = medio + 1; //redondea para abajo
		int k = primero;   
		
		while (i <= medio && j <= ultimo) {

				if (arregloAux[i] <= arregloAux[j]) {
					arreglo[k] = arregloAux[i];
					i++;
		
				} else {
					arreglo[k] = arregloAux[j];
					j++;
				}
				
				k++;
			}
		
		while (i <= medio){			
			arreglo[k] = arregloAux[i];
			k++;
			i++;
		}

	}

}
