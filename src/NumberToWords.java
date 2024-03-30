public class NumberToWords {

    public static void main(String[] args) {
//        numberToWords(100);
        System.out.println(reverse(123));
        System.out.println(getDigitCount(100));
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value!");
//            return;
        }

        if (number == 0) {
            System.out.println("zero");
//            return;
        }

        int reversedNumber = reverse(number);
        while (reversedNumber > 0) {

            int lastNumber = reversedNumber % 10;
            switch (lastNumber) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                default:
                    System.out.println("Invalid Value!");

            }
            reversedNumber /= 10;
        }
    }

    public static int reverse(int number) {

        int reversedNumber = 0;
        while (number != 0) {
            int lastDigit = number % 10; // Extrage ultima cifră
            reversedNumber = reversedNumber * 10 + lastDigit; // Adaugă cifra la numărul invers
            number /= 10; // Elimină ultima cifră din numărul original
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1; // Return -1 for negative numbers
        }

        if (number == 0) {
            return 1; // Special case: if the number is 0, it has 1 digit
        }

        int count = 0;
        while (number > 0) {
            count++; // Increment the count for each digit
            number /= 10; // Move to the next digit by dividing the number by 10
        }
        return count;
    }


}

