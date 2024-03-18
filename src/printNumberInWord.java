public class printNumberInWord {

    public static void main(String[] args) {
        printNumbers(0);
        printNumbers(1);
        printNumbers(2);
        printNumbers(3);
        printNumbers(4);
        printNumbers(5);
        printNumbers(6);
        printNumbers(7);
        printNumbers(8);
        printNumbers(9);
        printNumbers(10);
    }

    public static void printNumbers(int number) {

        String numberInWord;
        switch (number) {
            case 0 -> numberInWord = "ZERO";
            case 1 -> numberInWord = "ONE";
            case 2 -> numberInWord = "TWO";
            case 3 -> numberInWord = "THREE";
            case 4 -> numberInWord = "FOUR";
            case 5 -> numberInWord = "FIVE";
            case 6 -> numberInWord = "SIX";
            case 7 -> numberInWord = "SEVEN";
            case 8 -> numberInWord = "EIGHT";
            case 9 -> numberInWord = "NINE";
            default -> numberInWord = "OTHER";
        }
        System.out.println(numberInWord);
    }
}
