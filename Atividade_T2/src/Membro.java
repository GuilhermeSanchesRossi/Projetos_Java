public abstract class Membro implements PostarMensagem {
    protected String nome;
    protected String email;
    protected String funcao;

    public Membro(String nome, String email, String funcao) {
        this.nome = nome;
        this.email = email;
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Membro [email=" + email + ", funcao=" + funcao + ", nome=" + nome + "]";
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getFuncao() {
        return funcao;
    }
}
