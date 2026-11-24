public class Asserts {

    public static void main(String[] args) {
        assertsBST();
        assertsHeap();
    }

    static void assertsBST() {
        BST bst = new BST();
        assert bst.contaMenores(10) == 0 : "Should return 0 for an empty tree";

        bst = new BST();
        int[] elements = {1, 2, 3, 4, 5};
        bst.add(elements);
        assert bst.contaMenores(6) == 5;

        bst = new BST();
        elements = new int[]{10, 15, 20, 25};
        bst.add(elements);
        assert bst.contaMenores(5) == 0;

        bst = new BST();
        elements = new int[]{10, 5, 15, 3, 7, 12, 18};
        bst.add(elements);
        assert bst.contaMenores(8) == 3;

        bst = new BST();
        bst.add(10);
        assert bst.contaMenores(5) == 0;
        assert bst.contaMenores(15) == 1;
    }

    static void assertsHeap() {
        // violação na raiz; as subárvores dos filhos já são max-heaps válidas
        int[] arrayRaiz = {3, 19, 17, 5, 10, 13, 7};
        Heap heap = new Heap(arrayRaiz);
        heap.heapify(0);
        assert heap.ehMaxHeap() : "heapify(0) deve restaurar a propriedade de max-heap";

        // violação em um nó interno que não é a raiz
        int[] arrayInterno = {50, 3, 40, 20, 15, 35, 10};
        heap = new Heap(arrayInterno);
        heap.heapify(1);
        assert heap.ehMaxHeap() : "heapify(1) deve restaurar a propriedade de max-heap na subárvore afetada";

        // índice passado é uma folha; heap já válido não deve ser alterado
        int[] arrayFolha = {50, 30, 40, 20, 10, 35, 25};
        heap = new Heap(arrayFolha);
        heap.heapify(6);
        assert heap.ehMaxHeap() : "heap já era válido; heapify em uma folha não deve quebrá-lo";

        // heap com um único elemento
        int[] arrayUmElemento = {42};
        heap = new Heap(arrayUmElemento);
        heap.heapify(0);
        assert heap.ehMaxHeap() : "heap com um elemento deve permanecer um max-heap válido";
        assert heap.size() == 1;

        // violação que precisa se propagar por dois níveis
        int[] arrayClassico = {16, 4, 10, 14, 7, 9, 3, 2, 8, 1};
        heap = new Heap(arrayClassico);
        heap.heapify(1);
        assert heap.ehMaxHeap() : "heapify(1) deve propagar a troca até restaurar a propriedade de max-heap";
    }

}
