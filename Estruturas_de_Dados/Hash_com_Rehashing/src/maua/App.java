package maua;

public class App {
    public static void main(String[] args) throws Exception {

        Integer[] tabChaves = new Integer[] { 23, 45, 77, 11, 33, 49, 10, 4, 89, 14 };
        Integer[] tabHash = new Integer[10];

        Integer hashCode = null, chave;
        for (int i = 0; i < tabChaves.length; i++) {
            chave = tabChaves[i];
            hashCode = hash(chave);
            System.out.println("Chave = " + chave +
                    " mapeada para hascode = " + hashCode);
            if (tabHash[hashCode] == null)
                tabHash[hashCode] = tabChaves[i];
            else {
                System.out.println("** Colisao no slot da Tabela Hash ** ");        //Novo hashCode retornado pela função rehashing
                Integer newHashCode = rehashing(tabHash, hashCode);
                tabHash[newHashCode] = tabChaves[i];
            }
        }
        System.out.println("\nTabela Aluno: ");
        System.out.println("--------------------------");
        for (int i = 0; i < tabChaves.length; i++)
            System.out.print("Slot " + i + " ---> " + tabChaves[i] + "\n");
        System.out.println("\nTabela HASH: ");
        System.out.println("--------------------------");
        for (int i = 0; i < tabHash.length; i++)
            if (tabHash[i] == null)
                System.out.println("Slot " + i + " ---> Valor nulo");
            else
                System.out.print("Slot " + i + " ---> " + tabHash[i] + '\n');

    }

    public static Integer hash(Integer chave) {
        return chave % 10;
    }

    public static Integer rehashing(Integer[] tabhash, Integer indice) {
        for (Integer i = indice + 1; i < tabhash.length; i++) {     //Percorre o restante da tabela hash A PARTIR do hashCode de colisão
            if (tabhash[i] == null)
                return i;
        }
        for (Integer i = 0; i < indice; i++) {      //Se não encontrar um hashCode vazio no outro loop, procura a partir do início da tabela hash
            if (tabhash[i] == null)
                return i;
        }
        return null;
    }

}
