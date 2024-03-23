public class WhileDoWhileLoops {

    //🥃🥃[WHILE-LOOPS]🥃🥃
    public static void main(String[] args) {

        //FOR LOOP
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        //WHILE LOOP
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        //DO WHILE LOOP
        int y = 1;
        boolean isReady = false;
        do {
            if (y > 5) {
                break;
            }
            System.out.println(y);
            y++;
            isReady = (y > 0);
        } while (isReady);

        //another way for "while" loop

//        while (true){
//            if(j > 5){
//                break;
//            }
//            System.out.println(j);
//            j++;
//        } .... this method will be always 'true', but only until it meets the condition from the if statement
    }
}
