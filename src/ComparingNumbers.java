public class ComparingNumbers {

    public static void main(String[] args) {
        boolean porovnaniJedna = 1 > 3; // false
        boolean porovnaniDva = 5 < 2; // false
        boolean porovnaniTri = 10 == 10; // true
        boolean porovnaniCtyri = 10 == 15; // false

        boolean porovnaniPet = 5 >= 5; // true
        boolean porovnaniSest = 6 <= 10; // true

        porovnejVek(17);
    }

    // funkce přijme jako parametr vek typu int, vypíše true nebo false podle toho
    // jestli je vek plnoletý(18)
    public static void porovnejVek(int vek) {
        boolean jePlnolety = (vek >= 18);
        System.out.println(jePlnolety);
    }

}
