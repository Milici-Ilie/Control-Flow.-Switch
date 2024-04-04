import java.util.Scanner;

public class StringToNumber {

    public static void main(String[] args) {

        int currentYear = 2024;

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }// here we are using the 'try' & 'catch' method
    }

    public static String getInputFromConsole(int currentYear) {

        String name = System.console().readLine("Hi, What's your Name?");// here we are storing the name that the user gives to us and we use in the next line of code
        System.out.println("Hi " + name + ", Thanks for learning, good luck and dont loose hope!!!");

        String dateOfBirth = System.console().readLine("What year were you born? ");// here we are storing the age number and using in the next lines
        int age = currentYear - Integer.parseInt(dateOfBirth);// calculating the age of the user

        return name + " you are " + age + " years old!";
    }

    //////////////////////////////SCANNER method 👇////////////////////////////////
    //////////////////////////////SCANNER method 👇////////////////////////////////
    //////////////////////////////SCANNER method 👇////////////////////////////////


    public static String getInputFromScanner(int currentYear) {

        Scanner scanner = new Scanner(System.in);// implementing the "System.in"

        System.out.println("Hi, What's your Name? ");// here we are storing the name that the user gives to us and we use in the next line of code
        String name = scanner.nextLine();// NEXT LINE method ....

        System.out.println("Hi " + name + ", Thanks for learning, good luck and dont loose hope!!!");

        System.out.println("What year were you born? ");// here we are storing the age number and using in the next lines

        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= " + (currentYear));
            //🔰🔰[YEAR SETTINGS]🔰🔰] 👇👇👇 here we are checking if the user entered a type/wrong year/number in the input
            try {// checking for exceptions
            age = checkData(currentYear, scanner.nextLine());// NEXT LINE method ....
            validDOB = age < 0 ? false : true;
            }catch (NumberFormatException badUserData){//"badUserData" is just variable name that store the information, can be any name that you want
                System.out.println("Characters not allowed!!! Try again!");
            }//🔰🔰[YEAR SETTINGS]🔰🔰] 👆👆👆 checking for type in the year number
        } while (!validDOB);

        return name + " you are " + age + " years old!";
    }

    //🔰🔰[YEAR SETTINGS]🔰🔰 the method bellow will check if the year the user pass in is valid or not 🔰🔰[YEAR SETTINGS]🔰🔰
    public static int checkData(int currentYear, String dateOfBirth) {

        int dob = Integer.parseInt(dateOfBirth);//converting the birth year from String to number/value
        int minimumYear = currentYear - 120;// assuming that the 120 year is the oldest age for a person

        if ((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }//checking if the year that the user passed in is smaller than the minimumYear or greater than the currentYear and returning an error (-1)

        return (currentYear - dob);//returning the name of the user according to the year that he pass in
    }
}
