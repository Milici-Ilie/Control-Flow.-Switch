public class FizzBuzz {

    public static void main(String[] args) {
        FizzBuzzFizz(15);
    }

    public static int FizzBuzzFizz(int number) {
        if (number < 0) {
            return -1;
        }

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                System.out.println(i);
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
                System.out.println(i);
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
                System.out.println(i);
            } else {
                System.out.println(i);

            }
        }

        return number;
    }
}
