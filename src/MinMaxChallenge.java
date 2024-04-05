import java.util.Scanner;

public class MinMaxChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//storing the data from user typed in the console

        double max = 0;// to store the maximum number
        double min = 0; // to store the minimum number
        int loopCount = 0; //to keep track of the number times the loop gets executed

        while (true) {//endless loop
            System.out.println("Enter a number, or any character to exit:");//prompt user for an input
            String nextEntry = scanner.nextLine();
            try {//exception handling
                double validNum = Double.parseDouble(nextEntry);// value entered by the user
                if (loopCount == 0 || validNum < min) {//if loopCount is equal to 0 (this sets the first entry as the min value) and the user input is less than min, enter this loop, else go to line 21
                    min = validNum; //minimum value is now the user entry less than the value stored in min
                }
                if (loopCount == 0 || validNum > max) {//if loopCount is equal to 0 (this sets the first entry as the max value) and the user input is greater than max, enter this loop, else go to line 24, add 1 to the loopCount and start the loop all over again
                    max = validNum;//maximum value is now the user entry greater than the value stored in max
                }
                loopCount++;
            } catch (NumberFormatException nfe) {//when an invalid input is entered by the user, go to line 26
                break;//break out of the loop
            }
        }

        if (loopCount > 0) {//if loopCount is greater than 0, go to line 31, else go to line 33
            System.out.println("min = " + min + ", max = " + max);//print the min and max value
        } else {
            System.out.println("No valid data entered");//print "No valid data entered"
        }
    }
}