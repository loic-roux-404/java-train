import java.util.GregorianCalendar;

public class Main {
    public static void main(String args[]) {
        System.out.println("tst");    
        Personne p = new Personne();
        p.setNom("toto");
        p.setPrenom("JOJO");
        p.setDateNaiss(new GregorianCalendar(1999,10,8));
        System.out.println(p.calculAge());
    };
}