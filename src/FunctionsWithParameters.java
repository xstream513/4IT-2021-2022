public class FunctionsWithParameters {

    public static void main(String[] args) {
//        ahojSeJmenem("Vasil", "středa");
        obvodObdelniku(13.0, 7.0);
    }

    public static void obvodObdelniku(double stranaA, double stranaB) {
        // obvod = 2 * (a + b)
        double obvod = 2 * (stranaA + stranaB);
        System.out.println("Obvod obdélníku je: " + obvod);
    }

    public static void ahojSeJmenem(String jmeno, String den) {
        System.out.println("Ahoj. Jmenuji se " + jmeno + ". Dnes je " + den);
    }


    public static void ahoj() {
        System.out.println("Ahoj. Jmenuji se Honza.");
    }

}
