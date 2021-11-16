public class FunctionsWithReturnType {

    public static void main(String[] args) {
        String pozdrav = ahoj();
        System.out.println(pozdrav);
    }

    public static String ahoj() {
        return "Ahoj světe";
    }

    public static int soucetCisel(int cislo1, int cislo2) {
        int vysledek = cislo1 + cislo2;
        return vysledek;
    }

}
