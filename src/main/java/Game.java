public class Game {

    private int randomNumber;
    private int userNumber;

    public void start() {

do {
    randomNumber = MathUtil.generateRandomNumber();

    do {
        userNumber = MathUtil.readNumer("Please input your number:");

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
    } while (MathUtil.readInput("Do you want to continue (y)?").equals("y"));

System.out.println("Buy, buy...");
         }
    }
