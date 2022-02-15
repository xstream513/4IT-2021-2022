package oop;

public class ClovekTest {

    public static void main(String[] args) {
//        Clovek petr = new Clovek();
//        petr.jmeno = "Petr";
//        petr.prijmeni = "Novák";
//        petr.datumNarozeni = "1.1.2000";
//        petr.mistoNarozeni = "České Budějovice";
//        petr.pohlavi = "Muž";

        Clovek david = new Clovek();
        david.setJmeno("David");
        david.setPrijmeni("Oněkin");
        david.setDatumNarozeni("1.1.2000");
        david.setMistoNarozeni("Jihlava");
        david.setPohlavi("Muž");

        Clovek michal = new Clovek("Michal", "Novák", "02.12.2000", "Jihlava", "Muž");
        String celeJmeno = michal.vypisCeleJmeno();
        System.out.println(michal.spocitejVek());



    }

}
