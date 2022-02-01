import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        // vytvořím Scanner
        Scanner inputScanner = new Scanner(System.in);


        // výzva k zadání vstupu
        System.out.print("Zadejte vstup: ");

        // načtu vstup ve formátu String
        String vstup = inputScanner.nextLine();

        // vypíšu vstup na obrazovku
        System.out.println("Vstup je: " + vstup);
    }

}
