public class Amain {

	public static void main(String[] args) {
	
		long startTime;
		long totalTime;
		int cantElementos = 100000;
		
		Arreglo superarray = new Arreglo(cantElementos);
		
		for (int i = 0; i<cantElementos;i++){
			superarray.add((int)Math.floor(Math.random()*(cantElementos-1+1)+1));
		}
		
		startTime = System.currentTimeMillis();
		 //superarray.merge();	//como era de esperar use el mergesort con 10 millones de elementos y el totalTime no supero los 2000 milisegundos.
		 superarray.burbujeo(); //mientras que en el caso del burbujeo ya con 100.000 elementos se demoraba 17000 milisegundos en ordenar.
		totalTime = System.currentTimeMillis() - startTime;
		
		
		System.out.println("Tiempo total: "+totalTime);
		
	}

	

}
