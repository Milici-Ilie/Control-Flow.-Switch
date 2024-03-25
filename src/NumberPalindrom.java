public class NumberPalindrom {

    public static void main(String[] args) {

        System.out.println(isPalindrome(123321));
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(1232));
    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int original = number;
        while (original != 0) {
            reverse = reverse * 10 + original % 10;
            original /= 10;
        }
        return reverse == number;
    }
}

////////////////////another solution to find a palindrome number ///////////////////////
////////////////////another solution to find a palindrome number ///////////////////////
////////////////////another solution to find a palindrome number ///////////////////////

//public static boolean isPalindrome(int number) {
//    String numAsString = String.valueOf(number); // Convertim numărul în șir de caractere
//    int left = 0; // Indexul pentru caracterul din stânga
//    int right = numAsString.length() - 1; // Indexul pentru caracterul din dreapta
//
//    while (left < right) { // Parcurgem șirul până când ajungem la mijloc
//        if (numAsString.charAt(left) != numAsString.charAt(right)) {
//            return false; // Dacă caracterele nu coincid, numărul nu este palindrom
//        }
//        left++; // Trecem la următorul caracter din stânga
//        right--; // Trecem la următorul caracter din dreapta
//    }
//    return true; // Dacă toate caracterele coincid, numărul este palindrom
//}
