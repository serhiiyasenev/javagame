public class Game {

    private int randomNumber;
    private int userNumber;

    public void start() {

do {
    randomNumber = MathUtil.generateRandomNumber();
    int counter = 0;
    do {
        userNumber = MathUtil.readNumer("Please input your number:");
        counter++;
        if (counter == 10){
            break;
        }
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
        }
    while (randomNumber != userNumber) ;
    }
while (MathUtil.readInput("You tried 10 times ... Do you want to start again (y)?").equals("y"));

System.out.println("Buy, buy...");
         }
    }
