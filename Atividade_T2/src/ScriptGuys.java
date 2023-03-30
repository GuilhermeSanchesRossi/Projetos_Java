public class ScriptGuys extends Membro{

    public ScriptGuys(String nome, String email, String funcao) {
        super(nome, email, funcao);
    }

    @Override
    public String postarMsg(String turno) {
        if(turno.toUpperCase().equals("REGULAR"))
            return "Prazer em ajudar novos amigos de código!";
        if(turno.toUpperCase().equals("EXTRA"))
            return "QU3Ro_S3us_r3curs0s.py";
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
