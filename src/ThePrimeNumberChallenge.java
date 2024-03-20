public class ThePrimeNumberChallenge {

    public static void main(String[] args) {
//🔎🔎[FOR-LOOP-WHILE.LOOP]🔎🔎
//        System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number");
//        System.out.println("1 is " + (isPrime(1) ? "" : "NOT ") + "a prime number");
//        System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + "a prime number");
//        System.out.println("3 is " + (isPrime(3) ? "" : "NOT ") + "a prime number");
//        System.out.println("8 is " + (isPrime(8) ? "" : "NOT ") + "a prime number");
//        System.out.println("17 is " + (isPrime(17) ? "" : "NOT ") + "a prime number");

        int count = 0; // Initialize the counter variable // this is how we store values

        // Iterate through numbers and count prime numbers
        for (int i = 2; i <= 1000; i++) {
            if (isPrime(i)) {
                count++; // Increment the counter if the current number is prime
                if (count == 3) {
                    System.out.println("Found 3 - Exiting for loop");
                    break;//this is how we find a total of numbers using "if" statement
                }
            }//we increment the 'i' number every time by +1, "i++", to check for any number
        }

        // Print the count of prime numbers found
        System.out.println("Number of prime numbers found: " + count);

    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);//// Numbers equal to 2 are prime
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false; // If the number is divisible by any number other than 1 and itself, it's not prime
            }
        }

        return true;//// If the number is not divisible by any number other than 1 and itself, it's prime
    }
}
