public class NumberToWords {

    public static void main(String[] args) {
//        numberToWords(100);
        System.out.println(reverse(123));
        System.out.println(getDigitCount(100));
        numberToWords(123);
        numberToWords(100);

    }

    public static int reverse(int number) {

        int reverse = 0;//storing the last digits and creating the reverse number
        while (number != 0) {
            // multiply by 10 then and add last digit (number % 10)// by multiplying the number with 10 we add more and more numbers to the revers number, and we add the last digit from the "number"
            reverse = reverse * 10 + number % 10;
            number /= 10; // discard last digit// we raise the last digit after the process from above and let the loop to repeat until there are no more numbers to extract
        }
        return reverse;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int count = 0;
        // start from 1 and multiply by 10 each step so i goes 1, 10, 100, 1000
        // count how many times it was multiplied, and that's the digit count
        for (int i = 1; i <= number; i *= 10) {
            count++;
        }
        return count;
    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        // get reversed number
        int reverse = reverse(number);// calling the "reverse" method

        // subtract numberDigits and reverseDigits to get leading zeroes
        int leadingZeroes = getDigitCount(number) - getDigitCount(reverse);// getDigitCount(number) - getDigitCount(reverse): Această expresie calculează diferența dintre numărul de cifre al numărului inițial și numărul de cifre al numărului inversat. Această diferență reprezintă numărul de zerouri inițiale în reprezentarea cuvintelor numerice ale numărului dat. De exemplu, dacă numărul inițial are 3 cifre și numărul inversat are, de asemenea, 3 cifre, atunci nu există zerouri inițiale. Dacă numărul inițial are 4 cifre și numărul inversat are 3 cifre, atunci avem o zerou inițial, deoarece numărul inițial este mai mare și trebuie să adăugăm zerouri pentru a ajunge la același număr de cifre ca și în numărul inițial.

        if (number == 0) {
            System.out.println("Zero");
            return;
        }

        // use loop to print words
        while (reverse != 0) {
            int lastDigit = reverse % 10;
            switch (lastDigit) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }
            reverse /= 10;// the same thing like in the "reverse" method, we count in the "lastDigit" the new reverse number and at the end we decrease the "number" with: reverse /= 10;
        }

        // print zeroes if there are any leading zeroes in reversed number
        for (int i = 0; i < leadingZeroes; i++) {
            System.out.println("Zero");
        }//this method will display the zero's in our numbers. If the number is "100", our method "numberToWords" will display normally only "one", but this loop will also add/calculate the zero's
    }


}

