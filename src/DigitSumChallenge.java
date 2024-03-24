public class DigitSumChallenge {

    public static void main(String[] args) {
        System.out.println("The sum of the digits in number 1234 is " + sumDigits(1234));
        System.out.println("The sum of the digits in number 1234 is " + sumDigits(-125));
        System.out.println("The sum of the digits in number 1234 is " + sumDigits(4));
        System.out.println("The sum of the digits in number 1234 is " + sumDigits(32123));
    }

    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }

        int n = number; // Numărul dat// here we created a copy of the original number, in our case "number"
        int sum = 0; // Variabila pentru a stoca suma cifrelor

// Parcurgi cifrele numărului până când numărul devine 0
        while (n != 0) {
            // Extragi ultima cifră a numărului// here the "while loop" will run all the numbers that are different from '0'
            int lastDigit = n % 10;// here we are extracting the last digit/number from our "number" variable, for ex: 123 % 10 ===> n % 10 = 12.
            //also here "lastDigit" will stock the last digit number

            // Aduni ultima cifră la suma totală
            sum += lastDigit;//here we are suming the total of the "lastDigit", "sum = sum + lastDigit"

            // Reduci numărul eliminând ultima cifră
            n = n / 10;//by dividing the number with 10, ex: 123 / 10 = 12, we are reducing the number

            System.out.println("Ultima cifra: " + lastDigit);
        }

// Afisezi suma cifrelor
        System.out.println("Suma cifrelor: " + sum);

        return sum;
    }
}
