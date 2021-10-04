import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class LogicalOperatorExamples {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        boolean jsouStejna = a == b; // => false

        String str1 = "úterý";
        String str2 = "středa";

        boolean retezceJsouStejne = str1.equals(str2); // úterý != středa => false

        String den = LocalDateTime.now().getDayOfWeek().toString().toLowerCase(); // tuesday

        if(true) {
            System.out.println("Dnes je úterý");
        }


    }

}
