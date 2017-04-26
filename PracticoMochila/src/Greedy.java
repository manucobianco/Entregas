import java.util.ArrayList;

public class Greedy {
	
	ArrayList<Elemento> elementos;
	
	public Greedy(ArrayList<Elemento> objs){
		this.elementos = new ArrayList<Elemento>(objs);
		ordenarElementos(elementos);
	}
	
	private void ordenarElementos(ArrayList<Elemento> objs){  
		int i,j;
		Elemento aux;
		for(i=0; i<objs.size()-1; i++){
			for(j=0; j<objs.size()-i-1; j++){
				if(objs.get(j+1).getRelacionValorPeso() > objs.get(j).getRelacionValorPeso()){
					aux = objs.get(j+1);
					objs.set(j+1, objs.get(j));
					objs.set(j,aux);
				}
			}
		}		
	}
	
	
	public ArrayList<Elemento> cargar(double pesoTotal){
		double pesoActual = 0;
		ArrayList<Elemento> retornable = new ArrayList<Elemento>();
		int puntero = 0;
		
		while(pesoActual < pesoTotal && (puntero < elementos.size())){
			if(elementos.get(puntero).getCantidad() > 0){
				if(elementos.get(puntero).getPeso()+pesoActual < pesoTotal){
					retornable.add(elementos.get(puntero));
					elementos.get(puntero).restarCantidad();
					pesoActual += elementos.get(puntero).getPeso();
				}else{
					puntero ++;
				}
			}else{
				puntero ++;
			}
		}
		return retornable;
	}

	public String toString() {
		return "Greedy [elementos=" + elementos + "]";
	}
	
	
}

