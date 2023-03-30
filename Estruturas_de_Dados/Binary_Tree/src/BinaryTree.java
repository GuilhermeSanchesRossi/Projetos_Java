public class BinaryTree {
    BinaryTreeNode root;
    static int size;

    public BinaryTree() {
        this.root = null;
        size = 0;
    }

    public void insert_root(int valor) {
        BinaryTreeNode node = new BinaryTreeNode(valor);
        this.root = node;
        size = 1;
    }

    public BinaryTreeNode addNode(int valor) {
        size++;
        return new BinaryTreeNode(valor);
    }

    public int getSize() {  //retorna a quantidade de nós da árvore, útil se size for um campo encapsulado
        return size;
    }
}