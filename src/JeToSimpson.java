import java.util.Scanner;

public class JeToSimpson {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Zadejte jméno Simpsona: ");
        String input = inputScanner.nextLine();
        boolean vysledek = jeToSimpson(input.toUpperCase());
        if (vysledek == true) {
            System.out.println(input + " je Simpson!");
        } else {
            System.out.println(input + " není Simpson!");
        }
//        String result = vysledek ? (input + " je Simpson!") : (input + " není Simpson!");
//        System.out.println(result);
    }

    public static boolean jeToSimpson(String input) {
        String[] simpsonovi = {"Homer", "Marge", "Bart", "Lisa", "Maggie"};
        for (String simpson : simpsonovi) {
            if (simpson.toUpperCase().equals(input)) {
                return true;
            }
        }
        return false;
    }

}
