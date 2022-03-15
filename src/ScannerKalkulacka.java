import java.util.Scanner;

public class ScannerKalkulacka {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Zadejte první číslo: ");
        double prvniCislo = Double.parseDouble(scan.nextLine());
        System.out.print("Zadejte druhé číslo: ");
        double druheCislo = Double.parseDouble(scan.nextLine());
        System.out.print("Vyberte operaci[+ - * /]: ");
        String operace = scan.nextLine();
        double vysledek = calculator(prvniCislo, druheCislo, operace);
        System.out.println("Výsledek je: " + vysledek);

    }

    public static double calculator(double n1, double n2, String operation) {
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

    // příprava
    // vytvořte aplikaci, která po zapnutí vypíše:
    // zadejte číslo k odmocnění:
    // poté uživatel napíše číslo,
    // poté aplikace vypočítá odmocninu čísla
    // př. 16 a vypíše:
    // "odmocnina čísla 16 je 4"

}
