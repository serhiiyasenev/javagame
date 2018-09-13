import java.util.Random;
import java.util.Scanner;

public class Game {

    private int randomNumber;
    private int userNumber;

    public void start() {

do {
    randomNumber = generateRandomNumber();

    do {
        userNumber = readNumer("Please input your number:");

        if (userNumber < 0) {
            System.out.println("Digit should be more then 0");
        } else if (userNumber == randomNumber) {
            System.out.println("Bingoo...");
        } else if (userNumber < randomNumber) {
            System.out.println("Specify greater");
        } else if (userNumber > 50) {
            System.out.println("Digit should be less then 50");
        } else if (userNumber > randomNumber) {
            System.out.println("Specify less");
        }
        } while (randomNumber != userNumber) ;
    } while (readInput("Do you want to continue (y)?").equals("y"));

System.out.println("Buy, buy...");
}


    private int generateRandomNumber(){
        return new Random().nextInt(51);
    }

    private int readNumer (String message) {

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

    private String readInput(String message){
        System.out.println(message);
        return new Scanner(System.in).nextLine();
    }
}
