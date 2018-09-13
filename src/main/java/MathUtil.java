import java.util.Random;
import java.util.Scanner;

public class MathUtil {
    public static int generateRandomNumber(){
        return new Random().nextInt(51);
    }

    public static int readNumer (String message) {

        int result = 0;
        boolean isValied = false;

        do {
            try {
                result = Integer.valueOf(readInput(message));
                isValied = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            }
        }  while (!isValied);
        return result;
    }

    public static String readInput(String message){
        System.out.println(message);
        return new Scanner(System.in).nextLine();
    }
}
