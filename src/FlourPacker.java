public class FlourPacker {

    public static void main(String[] args) {
        System.out.println(canPack(1, 4, 15));
    }

    private static final int BIG_WEIGHT = 5;

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        boolean result = false;
        int totalBigWeight = bigCount * BIG_WEIGHT;
        if (totalBigWeight >= goal) {
            int remaining = goal % BIG_WEIGHT;
            if (smallCount >= remaining) {
                result = true;
            }
        } else {
            if (smallCount >= goal - totalBigWeight) {
                result = true;
            }
        }
        return result;
    }
    //if (totalBigWeight >= goal) { ... } else { ... }: Se verifică dacă greutatea totală a sacilor mari este mai mare sau egală cu obiectivul (goal). Dacă da, se utilizează sacii mari pentru a atinge obiectivul. Dacă nu, se folosesc sacii mici pentru a ajunge la obiectiv.
    //
    //int remaining = goal % BIG_WEIGHT;: Se calculează cantitatea de făină rămasă necesară după ce s-au folosit sacii mari pentru a atinge obiectivul. Aceasta se face folosind operatorul modulo %, care returnează restul împărțirii goal la greutatea unui sac mare (BIG_WEIGHT).
    //
    //if (smallCount >= remaining) { result = true; }: Se verifică dacă numărul de saci mici este suficient pentru a acoperi cantitatea de făină rămasă necesară (remaining). Dacă da, se setează result la true, deoarece este posibil să se facă un pachet cu cantitatea de făină dorită.
    //
    //Dacă greutatea totală a sacilor mari nu este suficient de mare pentru a atinge obiectivul (goal), se folosesc sacii mici pentru a acoperi diferența. Se verifică dacă numărul de saci mici este suficient pentru a atinge obiectivul (goal - totalBigWeight). Dacă da, se setează result la true.
}
