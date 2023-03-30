import java.util.*;

public class BinaryTreeNode {

    int item;
    BinaryTreeNode parent;
    BinaryTreeNode left;
    BinaryTreeNode right;
    static int maiorValor = 0;
    static int menorValor = 0;
    static int somaTotalValores = 0;
    static int numDeNulls = 0;
    static int numDeFolhas = 0;
    static ArrayList<Integer> alturas = new ArrayList<Integer>();   //vetor para armazenar as alturas que são encontradas quando se chega
    static int alturaDeNo = 0;                                      //nas folhas da árvore. Depois, encontra-se o maior valor desse vetor, que
                                                                    //será a altura da árvore
    public BinaryTreeNode(int item) {
        this.item = item;
        this.parent = null;
        this.left = null;
        this.right = null;
    }

    public boolean isLeft() {
        if (this.left == null)
            return false;
        else
            return true;
    }

    public boolean isRight() {
        if (this.right == null)
            return false;
        else
            return true;
    }

    public void binaryPreorder() {
        System.out.println(this.item);
        if (this.isLeft())
            this.left.binaryPreorder();
        if (this.isRight())
            this.right.binaryPreorder();
    }

    public void binaryPostorder() {
        if (this.isLeft())
            this.left.binaryPostorder();
        if (this.isRight())
            this.right.binaryPostorder();
        System.out.println(this.item);
    }

    public void binaryInorder() {
        if (this.isLeft())
            this.left.binaryInorder();
        System.out.println(this.item);
        if (this.isRight())
            this.right.binaryInorder();
    }

    public void procuraValor(int valor) { //checa se um dado valor inteiro existe na arvore, percorrendo-a por postOrder
        if (this.isLeft())
            this.left.procuraValor(valor);
        if (this.isRight())
            this.right.procuraValor(valor);
        if (this.item == valor)
            System.out.println("Valor " + valor + " encontrado!");
    }

    public void maiorValor() {  //percorre a árvore comparando a variável estática maiorValor com o item do próximo filho
        if (this.isLeft()) {
            if(maiorValor <= this.left.item)
                maiorValor = this.left.item;
            this.left.maiorValor();
        }
        if (this.isRight()) {
            if(maiorValor <= this.right.item)
                maiorValor = this.right.item;
            this.right.maiorValor();
        }
    }

    public void menorValor() {  //percorre a árvore comparando a variável menorValor com o item do próximo filho
        if (this.isLeft()) {
            if(menorValor >= this.left.item)
                menorValor = this.left.item;
            this.left.menorValor();
        }
        if (this.isRight()) {
            if(menorValor >= this.right.item)
                menorValor = this.right.item;
            this.right.menorValor();
        }
    }

    public void somaTotalValores() {    //não consegui fazer um único método para calcular a média dos valores da lista,
        somaTotalValores += this.item;  //fiz esse para retornar a soma total, e depois dividir pelo size da classe BinaryTree
        if (this.isLeft())
            this.left.somaTotalValores();
        if (this.isRight())
            this.right.somaTotalValores();
    }

    public void quantDeNulls() {    //se não encontrar um filho esquerdo ou direito, esse método incrementa a variável numDeNulls
        if (this.isLeft())              //também calcula o número de folhas da árvore após testar se tanto right como left são Null
            this.left.quantDeNulls();
        else
            numDeNulls++;
        if (this.isRight())
            this.right.quantDeNulls();
        else {
            numDeNulls++;
            numDeFolhas++;
        }
    }

    public void adquirirAlturas() {    //método que indica as alturas alcançadas a cada vez que chegamos a uma folha
        if (this.isLeft()) {           //e armazena no vetor alturas
            alturaDeNo++;
            this.left.adquirirAlturas();
        }
        if (this.isRight()) {
            alturaDeNo++;
            this.right.adquirirAlturas();
        }
        alturas.add(alturaDeNo);
        alturaDeNo = 0;
    }

    public int alturaDaArvore() {           //retorna a altura máxima, que é a altura da árvore
        return Collections.max(alturas);
    }
}
