
public class SuperMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Grafo SuperGrafo = new Grafo();

		for (int i = 0; i < 100; i++) {
			SuperGrafo.add(i);
			SuperGrafo.add(i+1);
			SuperGrafo.addArista(i, i+1);
		}
		
		SuperGrafo.addArista(10, 50); 
		
		System.out.println("Hay ciclo Iterable: "+SuperGrafo.esCiclico_Iterable());//funciona bien
		
		System.out.println("Hay ciclo Recursivo: "+SuperGrafo.esCiclico_Recursivo());//con grandes valores genera errores de tipo Stackoverflow
		
	}

}
