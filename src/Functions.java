public class Functions {

    // public => veřejná (přístup kdekoliv z programu)
    // static => statická (nepřistupuje se k ní přes instanci)
    // void => funkce nic nevrací

    public static void main(String[] args) {
        helloWorld();
        helloWorld();
        helloWorld();
        helloWorld();
        helloWorld();
    }

    public static void helloWorld() {
        System.out.println("Hello world! My name is Jan.");
    }

    public static void pozdrav() {
        String jmeno = "Michal";
        System.out.println("Ahoj světe! Jmenuji se" + jmeno);
    }

    public static void jmenoFunkce() {
        // TODO implementovat funknčnost
    }

}
