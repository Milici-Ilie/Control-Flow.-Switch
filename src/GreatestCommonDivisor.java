public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(15, 35));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int storingDivisor = 1;// storing the divisor of the number

        for (int i = 1; i <= Math.min(first, second); i++) {
            if (first % i == 0 && second % i == 0) {
//here we compare if the divisor number from "first" is equal to the "second" divisor number. then we want to display that divisor
                storingDivisor = i;
//              System.out.println(storingDivisor = i);
            }
        }

        return storingDivisor;
    }

    //////////////////another solution /////////////////

//    int min = first < second ? first : second; ///// here we are checking to see which of the numbers is the lowest and we compare it in the FOR LOOP to loop all the numbers in the smallest number,
//    first or second.

//    int gcd = 1;
//        for (int j = 1; j <= min; j++) {
//        if (first % j == 0 && second % j == 0) {
//            gcd = j;
//        }
//    }
//        return gcd;
//}

}
