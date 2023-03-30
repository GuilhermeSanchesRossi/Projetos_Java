import java.util.Arrays;

public class App {
    public static void main(String[] args) {
    
        int[] lista = {5,6,2,1,9,10,12,0,3,7,14,99,34,77};
        int tamanho = lista.length - 1;
        HeapSort.heapSort(lista, tamanho);

        System.out.println(Arrays.toString(lista));
    }
}
