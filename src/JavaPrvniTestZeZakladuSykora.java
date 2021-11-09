public class JavaPrvniTestZeZakladuSykora {

    public static void main(String[] args) {
        // 2.
        int n1 = 1;
        int n2 = 2;
        double num1 = 1.0;
        double num2 = 2.0;
        char a = 'A';
        char b = 'B';
        boolean pravda = true;
        boolean nepravda = false;
        String ahoj = "ahoj";
        String utery = "úterý";

        // 4.
        mojeNovaFunkce();
        mojeNovaFunkce();
        mojeNovaFunkce();
        mojeNovaFunkce();

        // 5 a)
        boolean whatAmIOne = !!!!!!!!!!!!true;
        boolean whatAmITwo = !!!!!!!!!!!!!!!false;
        boolean whatAmIThree = !!!!!!!!!!!!!!!!!!false;
        boolean whatAmIFour = !!!!!!!!!!!!!true;

        // 5 b)
        System.out.println("whatAmIOne = " + whatAmIOne);
        System.out.println("whatAmITwo = " + whatAmITwo);
        System.out.println("whatAmIThree = " + whatAmIThree);
        System.out.println("whatAmIFour = " + whatAmIFour);

        // 6.
        int stranaA = 5;
        int stranaB = 10;
        int stranaC = 6;
        int obvodTrujehlniku = stranaA + stranaB + stranaC;
        System.out.println("Výsledný obvod: " + obvodTrujehlniku);
    }

    // 3.
    public static void mojeNovaFunkce() {
        System.out.println("Ahoj světe, jmenuji se Honza.");
    }

}
