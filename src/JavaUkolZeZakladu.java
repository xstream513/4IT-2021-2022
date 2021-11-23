public class JavaUkolZeZakladu {

    public static void main(String[] args) {
        ahojSvete();
        pozdravMe("Adam");
        obvodCtverce(5);

        ktereCisloJeVetsi(10, 5);
        ktereCisloJeVetsi(3, 8);
        ktereCisloJeVetsi(2, 2);
        jePlnolety(-1, 18);

    }

    // 1.
    public static void ahojSvete() {
        System.out.println("Ahoj světe!");
    }

    // 2.
    public static void pozdravMe(String jmeno) {
        System.out.println("Ahoj, " + jmeno);
    }

    // 3.
    public static void obvodCtverce(double stranaCtverce) {
        double obvodCtverce = 4 * stranaCtverce;
        System.out.println("Obvod čtverce je: " + obvodCtverce + ".");
    }

    // 4.
    public static void jsouCislaStejna(int n1, int n2) {
        if (n1 == n2) {
            System.out.println("Jsou stejná");
        } else {
            System.out.println("Nejsou stejná");
        }
    }

    // 5.
    public static void ktereCisloJeVetsi(int prvniCislo, int druheCislo) {
        if (prvniCislo > druheCislo) {
            System.out.println("První číslo: " + prvniCislo + ", je větší než: " + druheCislo);
        } else if (druheCislo > prvniCislo) {
            System.out.println("Druhé číslo: " + druheCislo + ", je větší než: " + prvniCislo);
        } else {
            System.out.println("Obě čísla jsou stejná");
        }
    }

    // 6.
    public static void jePlnolety(int vek, int hranicePlnoletosti) {
        if (vek < 0) {
            System.out.println("Neplatný věk");
        } else if (vek >= hranicePlnoletosti) {
            System.out.println("Ano");
        } else {
            System.out.println("Ne");
        }
    }



}
