public class WhileLoopExemple {
    public static void main(String[] args) {

        int number = 0;
        while (number < 50) {
            number += 5;
            //this is how we can skip some conditions if we want, for exemple we want to skip the number that are divided by %25 , check the code bellow 👇
            if (number % 25 == 0) {
                continue;//"continue" means that when the logic meets the numbers that are divided with 25 (25 & 50) will skip them and continue with the loop
            }

            System.out.println(number + "_");
        }
    }
}
