public class MobileMembers extends Membro {

    public MobileMembers(String nome, String email, String funcao) {
        super(nome, email, funcao);
    }

    @Override
    public String postarMsg(String turno) {
        if(turno.toUpperCase().equals("REGULAR"))
            return "Happy Coding!";
        if(turno.toUpperCase().equals("EXTRA"))
            return "Happy_C0d1ng. Maskers";
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
