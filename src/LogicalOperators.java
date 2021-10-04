public class LogicalOperators {

    public static void main(String[] args) {
        // klíčová slova

        // || => OR (nebo) => altgr + w
        // && => AND (a) => altgr + c
        // ! => otočení pravdivosti(negace)

//        boolean logicalAnd = true && true; // true
//        boolean logicalAndFalse = true && false; // false
//        boolean logicalOr = true || true; // true
//        boolean logicalOr2 = true || false; // true
//        boolean logicalOrFalse = false || false; // false

        boolean logicalAnd = true && true;
        boolean logicalAndFalse = true && false;
        boolean logicalOr = true || true;
        boolean logicalOr2 = true || false;
        boolean logicalOrFalse = false || false;


        boolean negace = !true; // false
        boolean negace2 = !false; // true

        System.out.println(negace);

    }

}
