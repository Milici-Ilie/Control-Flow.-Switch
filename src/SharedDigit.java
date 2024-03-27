public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(19, 90));
    }

    public static boolean hasSharedDigit(int firstNumber, int lastNumber) {
        if ((firstNumber < 10 || firstNumber > 99) || (lastNumber < 10 || lastNumber > 99)) {
            return false;
        }

        int firstLastDigit = firstNumber % 10;
        int firstFirstDigit = firstNumber / 10;
        int lastLastDigit = lastNumber % 10;
        int lastFirstDigit = lastNumber / 10;

        return firstLastDigit == lastLastDigit || firstFirstDigit == lastFirstDigit || firstLastDigit == lastFirstDigit || firstFirstDigit == lastLastDigit;
    }
}

///////////////////USING VARIABLES/////////////////////////////////

//public class SharedDigit {
//
//    public static boolean hasSharedDigit(int first, int second) {
//
//        boolean firstValid = first > 9 && first < 100;
//        boolean secondValid = second > 9 && second < 100;
//
//        if (!firstValid || !secondValid) {
//            return false;
//        }
//
//        int firstLeftDigit = first / 10;
//        int firstRightDigit = first % 10;
//        int secondLeftDigit = second / 10;
//        int secondRightDigit = second % 10;
//
//        boolean firstShared = firstLeftDigit == secondLeftDigit || firstLeftDigit == secondRightDigit;
//        boolean secondShared = firstRightDigit == secondLeftDigit || firstRightDigit == secondRightDigit;
//
//        return firstShared || secondShared;
//    }
//}
