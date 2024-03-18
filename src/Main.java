public class Main {

    //🍥🍥[SWITCH-STATEMENT]🍥🍥
    public static void main(String[] args) {

        int switchValue = 3;

//        switch (switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Values was 2");
//                break;
//            case 3:
//                System.out.println("Value was 3");
//                break;
//            case 4:
//            case 5:
//            case 6:
//                System.out.println("Was a 4, a 5, or a 6");
//                System.out.println("Actually it was a " + switchValue);
//                break;
//            default:
//                System.out.println("Was not 1 or 2 or 3 or 5 or 6");
//                break;
//        }

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);

            }
            default -> System.out.println("Was not 1, 2, 3, 4, or a 5");
        }

        String month = "OCTOBER";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }

    public static String getQuarter(String month) {

        //🍥🍥[SWITCH-STATEMENT]🍥🍥 ❗❗❗ this is the new way for switch statement 👇
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> {yield "1st";}// 🍥🍥[SWITCH-STATEMENT]🍥🍥 including the "yield"/return statement directly in the "case"
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
             String badResponse = month + " is bad";
             yield badResponse;
            }
        };
    }
}
