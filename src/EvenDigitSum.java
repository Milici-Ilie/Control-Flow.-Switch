public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println("The sum of the even numbers is " + getEvenDigitSum(123456789));
        System.out.println("The sum of the even numbers is " + getEvenDigitSum(252));
        System.out.println("The sum of the even numbers is " + getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number != 0) {// Extragi ultima cifră a numărului// here the "while loop" will run all the numbers that are different from '0'
            int lastDigit = number % 10;// here we are extracting the last digit/number from our "number" variable, for ex: 123 % 10 ===> n % 10 = 12.

            //also here "lastDigit" will stock the last digit number
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }

            number = number / 10;

//            System.out.println(evenNumber);
        }
        return sum;
    }

    //////////////////////////////////NORMAL FOR LOOP /////////////////////////////////

//    int sum = 0;
//        for (int i = number; i > 0; i /= 10) {
//        int lastDigit = i % 10;
//        if (lastDigit % 2 == 0) {
//            sum += lastDigit;
//        }
//    }

    ////////////////////////////////////EVEN NUMBER METHOD ////////////////////////


//    public static boolean isEvenNumber(int number) {
//        if ((number % 2) == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }//// ==== this is a way by creating a new method to find out if our number is even or not

}
