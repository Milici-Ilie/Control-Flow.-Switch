public class TheForLoop {

    //🔎🔎[LOOP-WHILE.LOOP]🔎🔎
    public static void main(String[] args) {
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }

        for (double percentage = 1.0; percentage <= 5.0; percentage++) {
            double interestAmount = calculateInterest(10000.0, percentage);
            System.out.println("10.000 at " + percentage + "% interest = " + interestAmount);
        }

        for (double amount = 7.5; amount <= 10; amount += 0.25) {
            double dollarsAmount = calculateInterest(100, amount);
            if (dollarsAmount > 8.5) {
                break;
            }

            System.out.println("$100 at " + amount + "% interest = $" + dollarsAmount);
        }//🔎🔎[LOOP-WHILE.LOOP]🔎🔎 very important and logical operator, how to increase the amount with a specific amount, in our case with "+ 0.25" until it reaches the amount <= 10;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
