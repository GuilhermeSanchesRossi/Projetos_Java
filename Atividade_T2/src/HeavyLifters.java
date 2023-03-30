public class HeavyLifters extends Membro {

    public HeavyLifters(String nome, String email, String funcao) {
        super(nome, email, funcao);
    }

    @Override
    public String postarMsg(String turno) {
        if(turno.toUpperCase().equals("REGULAR"))
            return "Podem contar conosco!";
        if(turno.toUpperCase().equals("EXTRA"))
            return "N00b_qu3_n_Se_r3pita.bat";
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
