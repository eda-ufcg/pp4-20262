public class ContaMenoresAsserts {

    public static void main(String[] args) {
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

}
