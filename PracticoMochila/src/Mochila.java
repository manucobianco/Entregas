import java.util.ArrayList;

public class Mochila {
	
	double pesoTotal;
	//double valorTotal;
	
	ArrayList<Elemento> Contenido;
	
	public	Mochila(double peso){
		this.pesoTotal = peso;
		this.Contenido = new ArrayList<Elemento>();	
	}
	
	public void cargar(ArrayList<Elemento> objs){
		
		Greedy ordenador = new Greedy(objs);
		Contenido = ordenador.cargar(pesoTotal);

	}
	
	public String toString() {
		String retornar = "";
		
		for (int i = 0; i < Contenido.size(); i++) {
			retornar += Contenido.get(i).toString();
		}
		return retornar;
	}
	
	
}
