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

        String numbers = switch (number) {
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "OTHER";


        };

        System.out.println(numbers);
    }
}
