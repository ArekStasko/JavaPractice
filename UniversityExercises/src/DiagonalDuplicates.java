import java.util.Arrays;
import java.util.Random;

public class DiagonalDuplicates {

    public static void Run(){
        Random random = new Random();
        int[][] tablica4 = new int[8][8];

        for(int i = 0; i<tablica4.length; i++) {
            for(int j = 0; j<tablica4[i].length; j++) {
                tablica4[i][j] = random.nextInt(10);
            }
        }

        var wynik = new int[16];
        for(int i = 0; i<tablica4.length; i++) {
            wynik[i] = tablica4[i][tablica4[i].length-1-i];
            wynik[wynik.length-1-i] = tablica4[i][i];
        }

        Arrays.sort(wynik);

        int sameValue = -1;
        for (int i = 0; i < wynik.length - 2; i++) {
            if (wynik[i] == wynik[i + 1] && wynik[i] == wynik[i + 2]) {
                sameValue = wynik[i];
            }
        }

        if(sameValue != -1){
            System.out.println("W tablicy są trzy takie same wartości :");
            System.out.println(sameValue);
        }
    }
}
