import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Zadejte první číslo: ");
        String n1Str = inputScanner.nextLine();

        System.out.print("Zadejte druhé číslo: ");
        String n2Str = inputScanner.nextLine();

        Integer num1 = Integer.parseInt(n1Str);
        Integer num2 = Integer.parseInt(n2Str);

        System.out.print("Zadejte operaci(* / + -): ");
        String operace = inputScanner.nextLine();

        int result = calculator(num1, num2, operace);
        System.out.println("Výsledek: " + result);

    }

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


}
