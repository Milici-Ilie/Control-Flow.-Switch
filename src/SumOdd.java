public class SumOdd {

    public static void main(String[] args) {
        SumOdd sumOdd = new SumOdd();
        SumOddRange sumOddRange = sumOdd.new SumOddRange();
        int sum = sumOddRange.sumOdd(1, 100);
        System.out.println("Suma numerelor impare între 1 și 100 este: " + sum);


        //nu stiu cum sa apele acest metode pentru a afisa raspunsul
    }

    public class SumOddRange {

        public static boolean isOdd(int number) {
            return (number > 0) && (number % 2 != 0);
        }

        public static int sumOdd(int start, int end) {
            if (start > end || start <= 0) {
                return -1;
            }

            int sum = 0;

            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        }
    }


//    public class SumOddRange {
//
//        public static boolean isOdd(int number) {
//            return number > 0 && number % 2 != 0;
//        }
//
//        public static int sumOdd(int start, int end) {
//
//            if (start < 0 || end < 0 || end < start) {
//                return -1;
//            }
//
//            int sum = 0;
//            for (int i = start; i <= end; i++) {
//                if (isOdd(i)) {
//                    sum += i;
//                }
//            }
//            return sum;
//        }
//    }

}

// OR ANOTHER SOLUTION

