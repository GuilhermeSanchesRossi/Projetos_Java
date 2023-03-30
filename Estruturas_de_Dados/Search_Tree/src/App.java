public class App {
    public static void main(String[] args) {

        //int somaTotal, somaNodes;

        SearchTree tree = new SearchTree();

        int[] valores = new int[]{3, 7, 8, 12, 10, 5};
        for (int i = 0; i < valores.length; i++)
            tree.addNode(valores[i]);
        
        //tree.addNode(6);
        //tree.root.binaryPreorder();

        //System.out.println(tree.ProcuraValor(11));

        //tree.root.binaryPreorder();

        //tree.menorValor();
        //System.out.println(tree.getMenorValor());

        //tree.root.numNodes();
        //somaNodes = tree.root.getNumNodes();
        //tree.root.somaTotal();
        //somaTotal = SearchTreeNode.getSomaTotal();
        //System.out.println(somaNodes + " " + somaTotal + " " + somaTotal/somaNodes);      
        
        //tree.Altura();
        //System.out.println(tree.getAltura());

        //tree.root.quantDeNulls();
        //System.out.println(tree.root.getNulls());

        tree.root.multiplosDe2();

    }
}
