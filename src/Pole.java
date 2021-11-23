public class Pole {

    public static void main(String[] args) {
        String[] pole = new String[] {"Adam", "Petr", "Michal"};
        int[] poleCisel = new int[] {1,2,3,4,5};

        System.out.println(pole[0] + " " + pole[1] + " " + pole[2]);
        pole[0] = "Honza";
        System.out.println(pole[0] + " " + pole[1] + " " + pole[2]);

        String[] druhePole = new String[3];
        druhePole[0] = "Prvni";
        druhePole[1] = "Druhy";
        druhePole[2] = "Treti";

        System.out.println(druhePole);

        for (String prvek : druhePole) {
            System.out.println("Prvek je: " + prvek);
        }
    }

}
