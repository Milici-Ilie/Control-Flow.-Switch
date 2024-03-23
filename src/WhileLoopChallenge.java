public class WhileLoopChallenge {

    public static void main(String[] args) {

        int number = 4;//the code will start at number 4, but will immediatly be incremented with 1 bellow in the statement "number++"
        int finishNumbers = 20;
        int evenCount = 0;//counting the numbers and stopping at a specify condition
        int oddCount = 0;
        int totalNumbers = 0; // calculating the sum of all numbers, odd and even and displaying the total of them

        /////////////////////////////////////////////////////////////////////////

        while (number <= finishNumbers) {
            number++;
            if (!isEvenNumber(number)) {
                oddCount++;// if is not an even count, like in our case "!isEvenNumber" we will count to odd count (numere impare)
                continue;// this is how we check if is NOT an even number, we must specify the "!" in front of our method, otherwise will display the not even numbers if we do not do this// if is
                // not an even number we will continue
            }
            System.out.println("Even number" + number);
            evenCount++;//if it is an even number we will counting it here

            if (evenCount >= 5) {
                break;//we stop when we find 5 numbers that are true according to our condition
            }
        }

        System.out.println("Total odd numbers found = " + oddCount);
        System.out.println("Total even numbers found = " + evenCount);
        System.out.println("Total numbers found = " + (oddCount + evenCount));

        ////////////////////////////////////////////////////////////////////////////
    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
