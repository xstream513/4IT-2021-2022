public class Conditions {

    public static void main(String[] args) {
        String den = "pátek";

        if (den.equals("úterý")) {
            System.out.println("Dnes je úterý.");
        } else if (den.equals("středa")) {
            System.out.println("Dnes je středa.");
        } else {
            System.out.println("Není úterý ani středa.");
        }

        jePlnolety(18, 21);
    }

    public static void jePlnolety(int vek, int hranice) {
        // když vek je větší nebo se rovná hranice, tak vypíše "Je plnoletý".
        // jinak vypíše: "Není plnoletý"
        if (vek >= hranice) {
            System.out.println("Je plnoletý");
        } else {
            System.out.println("Není plnoletý");
        }
    }

}
