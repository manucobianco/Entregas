package Pila;

public class Lista {
	private int tamanio;
	private Nodo PunteroInicial;
	
	public Lista(){
		PunteroInicial=null;
		tamanio=0;	
	}
	
	public int size(){
		return this.tamanio; 
	}
	
	public boolean esVacia(){//retorna si es vacia o no!
		return this.size() == 0;
	}
	
	public void agregarElemento(int i){//agrega un elemento AL PRINCIPIO de la lista
		Nodo aux = new Nodo();
		aux.setValor(i);
		if(PunteroInicial!=null){				
			aux.setSiguiente(PunteroInicial);
		}
		PunteroInicial = aux;		
		this.tamanio++;
	}
	
	public void eliminarElemento(int i){//borra el primer elemento que tenga el valor pedido
		if(PunteroInicial!=null){
			if(PunteroInicial.getValor()==i){
				PunteroInicial = PunteroInicial.getSiguiente();
			}else{
				Nodo cursor = PunteroInicial;
				boolean encontre = false;
				while(cursor.getSiguiente()!=null && !encontre){
					if(cursor.getSiguiente().getValor()==i){
						cursor.setSiguiente(cursor.getSiguiente().getSiguiente());
						encontre = true;
					}
					cursor = cursor.getSiguiente();
				}
			}
			
		}else{
			System.out.println("No hay elementos en la lista bigote!");
		}
	}
	
	public void insertar(int pos,int i){
		Nodo cursor = PunteroInicial;
		Nodo aux = new Nodo();
		aux.setValor(i);	
		int posActual=1;
		boolean encontre =false;
		if(PunteroInicial!=null){
			while(cursor.getSiguiente()!=null && !encontre){
				if(posActual+1 == pos){
					encontre=true;
					aux.setSiguiente(cursor.getSiguiente());
					cursor.setSiguiente(aux);
				}
				posActual++;
			}
			
		}else{
			agregarElemento(i);
		}
	}
	
	public boolean contieneElemento(int i){
		Nodo cursor = PunteroInicial;
		boolean encontre = false;
		while (cursor!=null&&!encontre){
			if(cursor.getValor()==i){
				encontre = true;
			}
			cursor = cursor.getSiguiente();			
		}
		return encontre;
	}
	
	public int getPrimero(){
		if(PunteroInicial!=null){
			return PunteroInicial.getValor();
		}
		return -1;
	}

}
