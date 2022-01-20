public class JavaDruhyTestPokrocileStrukturySykora {

    public static void main(String[] args) {
        System.out.println(nasobic(5.0, 1.5));
        int[] poleCisel = {1,2,3,4,5};
        System.out.println(obsahujePrvek(poleCisel, 3));
        System.out.println(calculator(5, 10, "*"));
        System.out.println(postupnostPrvku(new int[]{2,5,10,7}));
    }

    // 2.
    public static double nasobic(double c1, double c2) {
        double result = c1 * c2;
        return result;
    }

    // 3.
    public static boolean obsahujePrvek(int[] pole, int hledanyPrvek) {
        for (int prvek : pole) {
            if (prvek == hledanyPrvek) {
                // našel jsem
                return true;
            }
        }
        return false;
    }

    // 4.
    // calculator(5, 10, "+") => 15
    public static int calculator(int n1, int n2, String operation) {
        if (operation.equals("+")) {
            return n1 + n2;
        } else if (operation.equals("-")) {
            return n1 - n2;
        } else if (operation.equals("*")) {
            return n1 * n2;
        } else if (operation.equals("/")) {
            return n1 / n2;
        } else {
            System.out.println("Operation is invalid!");
            return 0;
        }
    }

    // 5.
    public static String ziskejCisloDne(int cisloDne) {
        if (cisloDne > 7 || cisloDne < 1) {
            return "Neplatný vstup";
        }
        if (cisloDne == 1) {
            return "pondělí";
        }
        if (cisloDne == 2) {
            return "úterý";
        }
        if (cisloDne == 3) {
            return "středa";
        }
        if (cisloDne == 4) {
            return "čtvrtek";
        }
        if (cisloDne == 5) {
            return "pátek";
        }
        if (cisloDne == 6) {
            return "sobota";
        }
        if (cisloDne == 7) {
            return "neděle";
        }
        return "";
    }

    // 6.

//    postupnostPrvku(new int[]{2,5,10,15}) => true
    public static boolean postupnostPrvku(int[] pole) {
        int predchoziPrvek = pole[0];
        for (int prvek : pole) {
            if (predchoziPrvek > prvek) {
                return false;
            }
            predchoziPrvek = prvek;
        }
        return true;
    }


}
