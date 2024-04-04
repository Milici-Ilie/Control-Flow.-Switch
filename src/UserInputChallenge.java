import java.util.Scanner;

//CHALLENGE - storing 5 numbers in a row and than displaying the sum of those numbers
public class UserInputChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);// Prin combinarea acestora, Scanner(System.in) permite programului să citească input de la utilizator de la tastatură.

        int counter = 1;//counting the numbers that the user enter
        int sum = 0;

        while (counter <= 5) {// creating the loop that will print in the console the message to enter numbers
            System.out.println("Enter number #" + counter + ":");
            String nextNumber = scanner.nextLine();// here we are storing the numbers that the user enter the input/console

            try {//creating the exception that will check if the number entered is valid or not, if is a typo, if contains letter, etc
                int number = Integer.parseInt(nextNumber);//taking the variable from above where we stored the numbers
                counter++;
                sum += number;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number!");
            }
        }

        System.out.println("The sum of the 5 numbers = " + sum);
    }


    //////////////////////////IMPLEMENTING DOUBLE NUMBERS///////////////////////
    //////////////////////////IMPLEMENTING DOUBLE NUMBERS///////////////////////
    //////////////////////////IMPLEMENTING DOUBLE NUMBERS///////////////////////

//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);// Prin combinarea acestora, Scanner(System.in) permite programului să citească input de la utilizator de la tastatură.
//
//        int counter = 1;//counting the numbers that the user enter
//        double sum = 0;
//
//        while (counter <= 5) {// creating the loop that will print in the console the message to enter numbers
//            System.out.println("Enter number #" + counter + ":");
//            String nextNumber = scanner.nextLine();// here we are storing the numbers that the user enter the input/console
//
//            try {//creating the exception that will check if the number entered is valid or not, if is a typo, if contains letter, etc
//                double number = Double.parseDouble(nextNumber);
//                counter++;
//                sum += number;
//            } catch (NumberFormatException nfe) {
//                System.out.println("Invalid number!");
//            }
//        }
//
//        System.out.println("The sum of the 5 numbers = " + sum);
//    }
}
