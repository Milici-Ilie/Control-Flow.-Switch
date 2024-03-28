public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(28)); // or 28, 5, etc
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int divisor;
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                divisor = i;
                System.out.println(divisor);

                sum += divisor;
                System.out.println(sum);
            }

        }

        if (sum == number) {
            return true;
        }

        return false;
    }

    ////////////another solution///////////////////

//    int sum = 0;
//
//    for(int i = 1; i < number; i++){
//        if(number % i == 0){
//            sum += i;
//        }
//    }
//
//    return sum == number;
}
