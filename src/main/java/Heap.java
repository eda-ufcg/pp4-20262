import java.util.Arrays;

public class Heap {

    private int[] heap;
    private int tail;

    // construtor que já recebe um array. feito para facilitar os testes.
    public Heap(int[] heap) {
        this.heap = heap;
        this.tail = this.heap.length - 1;
    }
    public Heap(int capacidade) {
        this.heap = new int[capacidade];
        this.tail = -1;
    }


  // Método para verificar se o heap está em ordem de max-heap
    public boolean ehMaxHeap() {
        for (int i = 0; i <= parent(tail); i++) {
            int esquerda = left(i);
            int direita = right(i);

            // Verifica se o pai é maior que os filhos
            if (esquerda <= tail && heap[i] < heap[esquerda]) {
                return false;
            }

            if (direita <= tail && heap[i] < heap[direita]) {
                return false;
            }
        }
        return true;
    }



    public boolean isEmpty() {
        return this.tail == -1;
    }

    public int left(int i) {
        return 2*i+1;
    }

    public int right(int i) {
        return (i+1)*2;
    }

    public int parent(int i) {
        return Math.floorDiv(i-1, 2);
    }

    // TODO implementar
    public void heapify(int i) {
    }

    private int max_index(int index, int left, int right) {
        if (this.heap[index] > this.heap[left]) {
            if (isValidIndex(right)) {
                if (this.heap[index] < this.heap[right])
                    return right;
            }
            return index;

        } else {
            if (isValidIndex(right)) {
                if (this.heap[left] < this.heap[right])
                    return right;
            }

            return left;
        }
    }

    private boolean isValidIndex(int index) {
        return index >= 0 && index <= tail;
    }

    private boolean isLeaf(int index) {
        return index > parent(tail) && index <= tail;
    }

    private void swap(int i, int j) {
        int aux = this.heap[i];
        this.heap[i] = this.heap[j];
        this.heap[j] = aux;
    }

    private void resize() {
        int[] novoHeap = new int[this.heap.length * 2];
        for (int i = 0; i <= tail; i++)
            novoHeap[i] = this.heap[i];

        this.heap = novoHeap;
    }

    public int size() {
        return this.tail + 1;
    }

    public String toString() {
        return Arrays.toString(this.heap);
    }

}
