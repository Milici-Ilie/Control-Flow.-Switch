public class DayOfTheWeekChallenge {

    public static void main(String[] args) {
        printDayOfWeek(7);
    }
//🍥🍥[SWITCH-STATEMENT]🍥🍥
    public static void printDayOfWeek(int day) {
//        if (day < 0 || day > 6) {
//            System.out.println("Invalid Day!");
//            return;
//        }

//        int dayOfTheWeek = day;
//        int dayWeekend;

        //🍥🍥[SWITCH-STATEMENT]🍥🍥 here we can see that we can create a "String" variable and declare a "switch" statement
        String dayOfTheWeek = switch (day) {
            case 0 -> {
                yield "Sunday";
            }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };

        System.out.println(day + " stands for " + dayOfTheWeek);
    }
}
