public class SearchTreeNode {

    SearchTreeNode parent;
    SearchTreeNode left;
    SearchTreeNode right;
    int key;
    static int numNodes = 0;
    static int somaTotal = 0;
    static int numDeNulls = 0;

    public SearchTreeNode(int chave) {
        this.parent = null;
        this.left = null;
        this.right = null;
        this.key = chave;
    }

    public boolean temLeft() {
        if(this.left == null)
            return false;
        else
            return true;
    }

    public boolean temRight() {
        if(this.right == null)
            return false;
        else
            return true;
    }

    public void binaryPreorder() {
        System.out.println(this.key);
        if (this.temLeft())
            this.left.binaryPreorder();
        if (this.temRight())
            this.right.binaryPreorder();
    }

    public void binaryPostorder() {
        if (this.temLeft())
            this.left.binaryPostorder();
        if (this.temRight())
            this.right.binaryPostorder();
        System.out.println(this.key);
    }

    public void binaryInorder() {
        if (this.temLeft())
            this.left.binaryInorder();
        System.out.println(this.key);
        if (this.temRight())
            this.right.binaryInorder();
    }

    public void numNodes() {
        if (this.temLeft())
            this.left.numNodes();
        if (this.temRight())
            this.right.numNodes();
        numNodes++; 
    }

    public int getNumNodes() {
        return numNodes;
    }
    
    public void somaTotal() {
        if (this.temLeft())
            this.left.somaTotal();
        if (this.temRight())
            this.right.somaTotal();
        somaTotal += this.key;
    }

    public static int getSomaTotal() {
        return somaTotal;
    }
    
    public void quantDeNulls() {    //se não encontrar um filho esquerdo ou direito, esse método incrementa a variável numDeNulls
        if (this.temLeft())
            this.left.quantDeNulls();
        else
            numDeNulls++;
        if (this.temRight())
            this.right.quantDeNulls();
        else
            numDeNulls++;
    }

    public int getNulls() {
        return numDeNulls;
    }

    public void multiplosDe2() {
        if (this.temLeft()) 
            this.left.multiplosDe2();
        if (this.temRight())
            this.right.multiplosDe2();
        if (this.key % 2 == 0)
            System.out.println(this.key);
    }
}
