public class Sum3And5Challenge {
    //🔎🔎[CHALLENGE]🔎🔎

    public static void main(String[] args) {

        int count = 0;// here we are storing the range, how many numbers we found
        int sum = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;//and here we are counting with 1 for every true condition to keep a counter that meet the conditions
                sum += i;// sum = sum  + i; // here we are adding the numbers that meet the condition to be divided by 3 or 5
                System.out.println("Number found " + i);
            }

            if (count == 5) {
                break;//we stop when we find 5 numbers that are true according to our condition
            }
        }

        System.out.println("Sum of the numbers: " + sum + " and a total of " + count + " numbers were found!");
    }
}

//=====================
//Sum 3 and 5 Challenge
//=====================
//
//*Create a for loop using a range of numbers from 1 to 1000 inclusive.
//
//*Sum all the numbers that can be divided by both 3 and 5
//
//*Print out the numbers that have met the above conditions
//
//*break out of the loop once you have found 5 numbers that met the conditions.
//
//*After breaking out of the loop, print the sum of the numbers that met the conditions.
//
//*Note: type all code in the main method

