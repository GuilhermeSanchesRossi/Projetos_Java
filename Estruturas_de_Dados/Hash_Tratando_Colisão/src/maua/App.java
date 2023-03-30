package maua;

public class App { // OBS: por algum motivo, o VSCode não reconhece a função main se ela não
                   // estiver na classe App,
                   // considerá-la como a classe TestHash
    public static void main(String[] args) {

        Integer[] tabKeys = new Integer[100000];
        for (Integer i = 0; i < tabKeys.length; i++)
            tabKeys[i] = i;
        SList[] tabHash = new SList[1000];
        for (Integer j = 0; j < tabHash.length; j++) {
            tabHash[j] = new SList();
        }

        Integer hashCode = null, chave;
        for (int i = 0; i < tabKeys.length; i++) {
            chave = (tabKeys[i]);
            hashCode = hash(chave);
            System.out.println("Chave = " + chave +
                    " mapeada para hascode = " + hashCode);
            tabHash[hashCode].addNode(chave); // Equivalente ao método InsereInicio()
        }

        System.out.println("\nTabela de chaves: ");
        System.out.println("--------------------------");
        for (int i = 0; i < tabKeys.length; i++)
            System.out.print("Slot " + i + " ---> " + tabKeys[i] + "\n");
        System.out.println("\nTabela HASH: ");
        System.out.println("--------------------------");
        for (int i = 0; i < tabHash.length; i++) {
            System.out.println("Lista encadeada da posição " + 
            i + " da tabela hash: ");
            tabHash[i].head.percorrerLista();
        }
    }

    public static Integer hash(Integer key) {
        return (key % 1000);    //No caso de 100.000 chaves, para resultar em 1000 hash chaves,
                                //devemos dividir por 1000
    }
}
