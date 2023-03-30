public class SearchTree {

    SearchTreeNode root;
    static int menorValor;
    static int altura = 0;

    public SearchTree() {
        this.root = null;
    }

    public void insertRoot(SearchTreeNode root) {
        this.root = root;
    }

    public void addNode(int chave) {
        SearchTreeNode newNode = new SearchTreeNode(chave);
        if (root == null)
            this.insertRoot(newNode);
        else {
            SearchTreeNode NodeTrab = this.root;
            while (true) {
                if (chave < NodeTrab.key) {
                    if (NodeTrab.left == null) {
                        NodeTrab.left = newNode;
                        newNode.parent = NodeTrab;
                        return;
                    } else {
                        NodeTrab = NodeTrab.left;
                    }
                } else {
                    if (NodeTrab.right == null) {
                        NodeTrab.right = newNode;
                        newNode.parent = NodeTrab;
                        return;
                    } else {
                        NodeTrab = NodeTrab.right;
                    }  
                }
            }
        }
    }

    public int ProcuraValor(int valor) { 
        SearchTreeNode nodeTrab = this.root;
        while (nodeTrab != null && nodeTrab.key != valor) { 
            if (valor < nodeTrab.key)
                nodeTrab = nodeTrab.left; 
            else
                nodeTrab = nodeTrab.right; 
        }
        if(nodeTrab == null)
            return 0;       //será retornado 0 se não for encontrado o valor passado como argumento     
        return nodeTrab.key; 
    }

    public void menorValor() {      //Para achar o menor valor da árvore, basta percorrê-la até o final dos nós da esquerda
        SearchTreeNode nodeAux = this.root;
        do {
            menorValor = nodeAux.key;
            nodeAux = nodeAux.left;
        } while (nodeAux != null);
    }

    public int getMenorValor() {
        return menorValor;
    }

    public void Altura() {      //Para encontrar a altura de uma árvore binária de pesquisa, basta ir até o último nó a direita (o maior nó)
        SearchTreeNode nodeTrab = this.root;
        do {
            altura++; 
            nodeTrab = nodeTrab.right;
        } while (nodeTrab != null);
        altura--;
    }

    public int getAltura() {
        return altura;
    }
    
}