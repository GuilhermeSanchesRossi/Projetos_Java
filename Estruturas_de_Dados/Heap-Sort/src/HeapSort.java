public abstract class HeapSort {

    public static void maxHeapify(int[] A, int pai, int tamanho) {
        int esq = 2 * pai + 1;
        int dir = 2 * pai + 2;
        int maior = pai;
        if (esq <= tamanho && A[esq] > A[maior])
            maior = esq;
        if (dir <= tamanho && A[dir] > A[maior])
            maior = dir;
        if (maior != pai) {
            int aux = A[pai];
            A[pai] = A[maior];
            A[maior] = aux;
            maxHeapify(A, maior, tamanho);
        }
    }

    public static void buildMaxHeap(int[] A, int tamanho) {
        tamanho = A.length - 1;
        for (int pai = tamanho / 2; pai >= 0; pai--) {
            maxHeapify(A, pai, tamanho);
        }
    }

    public static void heapSort(int[] A, int tamanho) {
        buildMaxHeap(A, tamanho);
        for (int i = tamanho; i>0; i--) {
            int aux = A[i]; 
            A[i] = A[0]; 
            A[0] = aux; 
            tamanho--; 
            maxHeapify(A, 0, tamanho);
        }
    }
}
