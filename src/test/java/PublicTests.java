import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class PublicTests {

    @Test
    void testContaMenores() {
        BST bst = new BST();
        assertEquals(0, bst.contaMenores(10),
            "Should return 0 for an empty tree");

        bst = new BST();
        int[] elements = {1, 2, 3, 4, 5};
        bst.add(elements);
        assertEquals(5, bst.contaMenores(6));

        bst = new BST();
        elements = new int[]{10, 15, 20, 25};
        bst.add(elements);
        assertEquals(0, bst.contaMenores(5));


        bst = new BST();
        elements = new int[]{10, 5, 15, 3, 7, 12, 18};
        bst.add(elements);
        assertEquals(3, bst.contaMenores(8));


        bst = new BST();
        bst.add(10);
        assertEquals(0, bst.contaMenores(5));
        assertEquals(1, bst.contaMenores(15));
    }


    @Test
    void testHeapifyViolacaoNaRaiz() {
        int[] array = {3, 19, 17, 5, 10, 13, 7};
        Heap heap = new Heap(array);

        heap.heapify(0);

        assertTrue(heap.ehMaxHeap(), "heapify(0) deve restaurar a propriedade de max-heap");
    }

    @Test
    void testHeapifyViolacaoEmNoInterno() {
        int[] array = {50, 3, 40, 20, 15, 35, 10};
        Heap heap = new Heap(array);

        heap.heapify(1);

        assertTrue(heap.ehMaxHeap(), "heapify(1) deve restaurar a propriedade de max-heap na subárvore afetada");
    }

    @Test
    void testHeapifyEmFolhaNaoAlteraHeapValido() {
        int[] array = {50, 30, 40, 20, 10, 35, 25};
        Heap heap = new Heap(array);

        heap.heapify(6);

        assertTrue(heap.ehMaxHeap(), "heap já era válido; heapify em uma folha não deve quebrá-lo");
    }

    @Test
    void testHeapifyComUmUnicoElemento() {
        int[] array = {42};
        Heap heap = new Heap(array);

        heap.heapify(0);

        assertTrue(heap.ehMaxHeap(), "heap com um elemento deve permanecer um max-heap válido");
        assertEquals(1, heap.size());
    }

    @Test
    void testHeapifyPropagaPorDoisNiveis() {
        int[] array = {16, 4, 10, 14, 7, 9, 3, 2, 8, 1};
        Heap heap = new Heap(array);

        heap.heapify(1);

        assertTrue(heap.ehMaxHeap(), "heapify(1) deve propagar a troca até restaurar a propriedade de max-heap");
    }

}
