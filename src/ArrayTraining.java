public class ArrayTraining {

    public static void main(String[] args) {
        // 192.168.45.80
        validateIPv4("192.168.45.80");
        System.out.println(decimalToBinary(12));

        // zkuste si doma udělat funkci binaryToDecimal, která převede číslo ve dvojkové soustavě na desítkovou
    }

    public static String decimalToBinary(int input) {
//        String inputString = String.valueOf(input);
        int mezikrok = input;
        String vysledek = "";
        while(mezikrok != 0) {
            if (mezikrok % 2 == 0) {
                vysledek = vysledek + "0";
                mezikrok = mezikrok / 2;
            } else {
                vysledek = vysledek + "1";
                mezikrok = mezikrok / 2;
            }
        }
        return reverseString(vysledek);
    }

    public static String reverseString(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static boolean validateIPv4(String input) {
        String[] inputSplit = input.split("\\.");
        if (inputSplit.length != 4) {
            return false;
        }
        for (String element : inputSplit) {
            if (isParsableInteger(element)) {
                Integer elementInteger = Integer.parseInt(element);
                if (elementInteger < 0 || elementInteger > 255) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }

    public static boolean isParsableInteger(String input) {
        try {
            Integer intValue = Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
