package classes;


public class Main {

	public static void main(String[] args) {
		long startTime;
		long endTime;
		int qtd = 10000;
        int v[] = new int[qtd]; 
        int j=0;
        
        /*for (int i=0; i<qtd; i++) {									// analisar vetor ordenado
        	v[i]=i;
        }/*
        
        /*for (int i=qtd-1; i>=0; i--) {								// analisar vetor ordenado de forma decrescente
        	v[j++]=i;
        }*/
        for (int i=0; i<qtd;i++) {										//analisar vetor aleatorio
        	v[i]=(int)(Math.random() * 40000 );
        }
        
        String vetNaoOrdenado = "|";
        for (int i=0; i<qtd; i++) {
            vetNaoOrdenado = vetNaoOrdenado + vetNaoOrdenado.valueOf(v[i]);
            vetNaoOrdenado = vetNaoOrdenado + "|";
        }
        
        System.out.println("\n\nVetor sem ordem:\n"+vetNaoOrdenado);
        
        startTime = System.currentTimeMillis();
        Sort op = new Sort();
        op.QuickSort(v, 0, qtd-1);                                   
        endTime = System.currentTimeMillis();
        
        String vetOrdenado = "|";
        for (int i=0; i<qtd; i++) {
            vetOrdenado = vetOrdenado + vetOrdenado.valueOf(v[i]);
            vetOrdenado = vetOrdenado + "|";
        }
        System.out.println("tempo de processamento -> " + (endTime - startTime));

        System.out.println("\n\nVetor ordenado:\n"+vetOrdenado);
        System.out.println("\n\n"+op.getContador());
    }
}
