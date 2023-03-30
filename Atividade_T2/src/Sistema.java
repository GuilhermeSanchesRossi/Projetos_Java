import java.util.ArrayList;

public class Sistema {
    private static String turno = "null";

    public static void rodar(){
        ArrayList<Membro> membros = new ArrayList<Membro>();
        membros.add(new MobileMembers("Guizao", "salve@gmail.com", "MobileMember"));
        membros.add(new HeavyLifters("Pedrasco", "coe@hotmail.com", "HeavyLifter"));
        membros.add(new ScriptGuys("Mat", "vish@yahoo.com", "ScrpitGuy"));
        membros.add(new BigBrothers("Zozo", "affz@gmail.com", "BigBrother"));

        boolean t = mudarTurno("extra");

        for(Membro m : membros){
            System.out.println(m.postarMsg(turno));
            System.out.println(m.toString());
        }

        for(int i = 0; i < membros.size(); i++){
            if(membros.get(i).getFuncao().toUpperCase().equals("HEAVYLIFTER"))
                membros.remove(membros.get(i));
        }

        for(Membro m : membros){
            System.out.println(m.postarMsg(turno));
            System.out.println(m.toString());
        }
    }

    public static boolean mudarTurno(String novoTurno){
        if(novoTurno.toUpperCase().equals(turno))
            return false;
        turno = novoTurno;
        return true;
    }
}
