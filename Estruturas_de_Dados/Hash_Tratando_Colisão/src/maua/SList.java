package maua;

public class SList {
    
    SListNode atual;    //Node de controle para ver qual foi o último a ser colocado na lista
    SListNode head;

    public SList() {
        this.atual = null;
        this.head = null;
    }

    public void addNode(Integer key) {
        SListNode newNode = new SListNode(key);
        if(this.atual == null) {    //Se este for o caso, a lista estará vazia, e newNode será o head dela
            this.head = newNode;
            this.atual = newNode;
        }
        else {
            this.atual.next = newNode;  //Nesse caso, o próximo do atual nó será o novo nó,
            this.atual = newNode;       //depois, o novo nó passa a ser o novo atual
        }
    }

}
