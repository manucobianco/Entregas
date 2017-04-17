import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Stack;

public class Grafo {
	
	ArrayList <Nodo> vertices;
	
	public Grafo(){
		vertices = new ArrayList <Nodo>();
	}
	
	public void add(int valor){//agrega un vertice al grafo
		vertices.add(new Nodo(valor));

	}
	
	public int cantidadAristas(){//retorna la cantidad de aristas que tiene un nodo
		int aristas = 0;
		for (int i=0; i<vertices.size(); i++) {
			aristas += vertices.get(i).getAdyacentes().size();
		}
		return aristas;
	}
	
	public Nodo buscaVerticeEnGrafo(int valor){ //busca si en el grafo existe el vertice con ese valor
		for (int i=0; i<vertices.size(); i++) {
			if (valor == vertices.get(i).getValor()){
				return vertices.get(i);
			}
		}
		return null;
	}
	
	public boolean existeArista(int i, int j){// devuelve si existe la arista entre los 2 valores dados
		try { //puede devolver null en caso de que no exista, por eso tiene que estar en try
			return (buscaVerticeEnGrafo(i).getAdyacentes().contains(buscaVerticeEnGrafo(j)));
		} catch (Exception exe) {// en caso de que no encuentre la exepcion se encarga de retornar false.
			return false;
		}
	}

	public void addArista(int i, int j){ //relaciona los 2 vercices dados 
		
		Adyacente aux = new Adyacente(buscaVerticeEnGrafo(j));
		buscaVerticeEnGrafo(i).addAdyacente(aux);
	}
	
	public ArrayList<Adyacente> adyacentes(int i){//retorna los adyacentes de un vertice
		return buscaVerticeEnGrafo(i).getAdyacentes();
	}
	
	////*****************////
	

	
	public boolean esCiclico_Recursivo(){//busca y devuelve si el grafo es ciclico o no, trabaja de manera recursiva
		Hashtable<Integer, EstadoDeVisita> nodos = new Hashtable<Integer, EstadoDeVisita>();
			for (int i=0; i<vertices.size(); i++){
				nodos.put(vertices.get(i).getValor(), EstadoDeVisita.NO_VISITADO);//crea la tabla con los valores por defecto en NO_VISITADO
			}
			
			for (int i=0; i<vertices.size(); i++){//recorre los valores, si el vertice en el que estoy parado no esta visitado, lo visita con el dfs_visit, y retorna true, significa que hay ciclo ya que vuele a un nodo que esta visitando                         
				if ((nodos.get(vertices.get(i).getValor()) == EstadoDeVisita.NO_VISITADO)){
					if (dfs_visit(vertices.get(i), nodos)){  
						return true;
					}
				}
			}
		return false;
	}
	
	public boolean dfs_visit(Nodo nodo, Hashtable<Integer, EstadoDeVisita> nodos){ 		//visita los nodos
		
		if (nodos.get(nodo.getValor()) == EstadoDeVisita.VISITANDO){
			return true;
		}
			
		nodos.put(nodo.getValor(), EstadoDeVisita.VISITANDO);
		
		for (Adyacente adyacente : nodo.getAdyacentes()){
			if( dfs_visit(adyacente.getDestino(), nodos)){
				return true;
			}
		}
		
		nodos.put(nodo.getValor(), EstadoDeVisita.VISITADO);
		return false;
	}
	
	public boolean esCiclico_Iterable(){//recorre el grafo de forma iterable. Usa una pila resolver 
		Hashtable<Integer, EstadoDeVisita> nodosVisita = new Hashtable<Integer, EstadoDeVisita>();
		
		Stack<Nodo> pila = new Stack<Nodo>();
		
		for (int i=0; i<vertices.size(); i++){
			nodosVisita.put(vertices.get(i).getValor(), EstadoDeVisita.NO_VISITADO);
		}
		
		pila.add(vertices.get(0));
		
		while (!pila.isEmpty()){//mientras la pila tenga vertices sigue funcionando
			Nodo aux = pila.peek();
			
			if(nodosVisita.get(aux.getValor()) == EstadoDeVisita.NO_VISITADO){
				nodosVisita.put(aux.getValor(), EstadoDeVisita.VISITANDO);
				if (vertices.size() > 0){
					for (int i = 0; i < aux.getAdyacentes().size(); i++) {
						if( (nodosVisita.get(aux.getAdyacenteAt(i).getDestino().getValor()) == (EstadoDeVisita.NO_VISITADO))){
							pila.add(aux.getAdyacenteAt(i).getDestino());
						}else if ((nodosVisita.get(aux.getAdyacenteAt(i).getDestino().getValor()) == (EstadoDeVisita.VISITANDO))){
							return true;
						}
					}
				}else{
					nodosVisita.put(aux.getValor(), EstadoDeVisita.VISITADO);
					pila.pop();
				}
				
			}else if(nodosVisita.get(aux.getValor()) == EstadoDeVisita.VISITADO){
				pila.pop();
			}else{
				nodosVisita.put(aux.getValor(), EstadoDeVisita.VISITADO);
				pila.pop();
			}
		}
		return false;
	}
	
}