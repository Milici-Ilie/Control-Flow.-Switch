public class DigitSumChallenge {

    public static void main(String[] args) {
        sumDigits(2);
    }

    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }

        int n = number; // Numărul dat
        int sum = 0; // Variabila pentru a stoca suma cifrelor

// Parcurgi cifrele numărului până când numărul devine 0
        while (n != 0) {
            // Extragi ultima cifră a numărului
            int lastDigit = n % 10;

            // Aduni ultima cifră la suma totală
            sum += lastDigit;

            // Reduci numărul eliminând ultima cifră
            n = n / 10;

            System.out.println("Ultima cifra: " + lastDigit);
        }

// Afisezi suma cifrelor
        System.out.println("Suma cifrelor: " + sum);

        return number;
    }
}
