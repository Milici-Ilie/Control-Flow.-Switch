public class FirstLastDigitSum {

    public static void main(String[] args) {

        System.out.println("The sum of the first and the last digit number is " + sumFirstAndLastDigit(252));
        System.out.println("The sum of the first and the last digit number is " + sumFirstAndLastDigit(257));
        System.out.println("The sum of the first and the last digit number is " + sumFirstAndLastDigit(0));
        System.out.println("The sum of the first and the last digit number is " + sumFirstAndLastDigit(5));
        System.out.println("The sum of the first and the last digit number is " + sumFirstAndLastDigit(-10));
        System.out.println("The sum of the first and the last digit number is " + sumFirstAndLastDigit(2345));
        System.out.println("The sum of the first and the last digit number is " + sumFirstAndLastDigit(6690));
    }

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;//use % 10 to get last digit in a number.

        while (number >= 10) {
            //to extract the first number we must compare if the number is greater than 10, because there are situations when the first number is 9
            number /= 10;// divide with 10 until there is 1 digit left (< 10) to get first digit.  This is also equivalent to number = number / 10.
        }

        int firstDigit = number;

        return firstDigit + lastDigit;
    }
}
