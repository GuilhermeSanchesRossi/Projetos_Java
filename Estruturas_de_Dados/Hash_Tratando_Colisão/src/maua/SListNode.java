package maua;

public class SListNode {
    
    Integer chave;
    SListNode next;

    public SListNode() {
        this.chave = null;
        this.next = null;
    }

    public SListNode(Integer key) {
        chave = key;
        this.next = null;
    }

    public void percorrerLista() {      //Deve ser aplicado no head da lista
        SListNode aux = this;
        while(aux != null) {
            System.out.println(aux.chave);
            aux = aux.next;
        }
    }
}
