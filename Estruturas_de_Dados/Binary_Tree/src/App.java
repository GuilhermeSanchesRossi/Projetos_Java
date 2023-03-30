public class App {
    public static void main(String[] args) throws Exception {
        BinaryTree tree = new BinaryTree();
        tree.insert_root(0);

        BinaryTreeNode no_1 = tree.addNode(1);
        BinaryTreeNode no_2 = tree.addNode(2);
        BinaryTreeNode no_3 = tree.addNode(3);
        BinaryTreeNode no_4 = tree.addNode(4);
        BinaryTreeNode no_5 = tree.addNode(5);
        BinaryTreeNode no_6 = tree.addNode(6);
        
        tree.root.left = no_1;
        tree.root.right = no_2;
        no_2.left = no_3;
        no_2.right = no_4;
        no_3.left = no_5;
        no_3.right = no_6;

        tree.root.adquirirAlturas();
        System.out.println(tree.root.alturaDaArvore());
    }
}
