import java.util.Scanner;

public class NonStaticFunctions {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String retezec = "ahoj";
        System.out.println(retezec.equals("ahoj"));
        retezec = retezec.toUpperCase();
        System.out.println(retezec);
        String cislo = String.valueOf(123);
        System.out.println(Math.pow(3.0, 2.0));
        System.out.println(Math.abs(-5));
    }

}
