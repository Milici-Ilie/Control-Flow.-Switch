public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(18, 90, 999));
    }

    public static boolean hasSameLastDigit(int numberOne, int numberTwo, int numberThree) {
        if ((numberOne < 10 || numberOne > 1000) || (numberTwo < 10 || numberTwo > 1000) || (numberThree < 10 || numberThree > 1000)) {
            return false;
        }

        int first = numberOne % 10;
        int second = numberTwo % 10;
        int third = numberThree % 10;

        boolean firstComparison = first == second || first == third;
        boolean secondComparison = second == third;

        return firstComparison || secondComparison;
    }

    public static boolean isValid(int number) {
        if (number < 10 || number > 1000) {
            return false;
        }

        return true;
    }
}

///////////////////////// another solution ////////////////////////////////

//public static boolean isValid(int number) {
//    return number >= 10 && number <= 1000;
//}
//
//public static boolean hasSameLastDigit(int a, int b, int c) {
//
//    if (!isValid(a) || !isValid(b) || !isValid(c)) {
//        return false;
//    }
//
//    int lastA = a % 10;
//    int lastB = b % 10;
//    int lastC = c % 10;
//    return (lastA == lastB) || (lastA == lastC) || (lastB == lastC);
//}
