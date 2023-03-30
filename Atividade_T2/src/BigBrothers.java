public class BigBrothers extends Membro{

    public BigBrothers(String nome, String email, String funcao) {
        super(nome, email, funcao);
    }

    @Override
    public String postarMsg(String turno) {
        if(turno.toUpperCase().equals("REGULAR"))
            return "Sempre ajudando as pessoas membros ou não S2!";
        if(turno.toUpperCase().equals("EXTRA"))
            return "...";
        else
            return "Null";
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getEmail() {
        // TODO Auto-generated method stub
        return super.getEmail();
    }

    @Override
    public String getFuncao() {
        // TODO Auto-generated method stub
        return super.getFuncao();
    }

    @Override
    public String getNome() {
        // TODO Auto-generated method stub
        return super.getNome();
    }
}
