import java.util.Scanner;

public class VypocetObvoduCtverce {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Zadejte stranu čtverce: ");
        String input = inputScanner.nextLine();
        double inputDouble = Double.parseDouble(input);
        double obvod = obvodCtverce(inputDouble);
        System.out.println("Obvod je: " + obvod);
    }

    public static double obvodCtverce(double stranaCtverce) {
        double obvodCtverce = 4 * stranaCtverce;
        return obvodCtverce;
    }

}
