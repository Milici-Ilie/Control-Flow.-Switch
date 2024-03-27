public class FactorPrinter {

    public static void main(String[] args) {
        printFactors(28);
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }

        for (int i = 1; i <= number; i++) {
            //here we start the loop from 1 "i = 1", then we run all the numbers until the maximum number wich is "i <= number", we increase this loop by 1 "i++" too check all the numbers
            if (number % i == 0) {
                //checking if the whole number is divisible by the "i" value/number that runs all the possible numbers until reaches the maximum value (number) and also check if is "== 0" to see if
                // there is no reminder meaning is a true factor number that divides perfectly the entire number
                System.out.println(i);//displaying the numbers that divide the whole number
            }
        }
    }
}
