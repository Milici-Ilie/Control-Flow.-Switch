import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);//using "scanner" and "system.in" we take values/info's or number from the keyboard from the user and store this data in our variable
        int sum = 0;
        int count = 0;
        long avg = 0;

        while (true) {//endless loop
            boolean hasNextInt = scanner.hasNextInt();// method "hasNextInt" will return true if "scanner" will store only "int" numbers, if there are double numbers or typo/letters, etc, the
            // method will return false ❗❗❗❗❗ IMPORTANT, method "hasNextInt()" will check if the data the user entered is valid or not (true or false) (int number or not) and only than the loop
            // will continue to the next lines, in our case to line 24
            if (!hasNextInt) {
                // break the loop on invalid input
                break;
            }
            sum += scanner.nextInt();//method "nextInt()" will check if the number is "int" and store this number, and calculate in our case
            count++;
            // clear buffer e.g. remove line separator
            scanner.nextLine();// this will read the entire line of cod and rerun the loop
        }

        if (count > 0) {//calculating the average of total sum
            avg = Math.round((double) sum / count);
        }

        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
