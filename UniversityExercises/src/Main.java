import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        displaySquare(20, 'x');
    }

    public static void displaySquare(int value, char character)
    {
        boolean switchChar = true;
        for(int i = 0; i < value; i++){
            for(int j = 0; j < value; j++){
                if(i == 0){
                    System.out.print(switchChar ? character : 'o');
                    System.out.print(' ');
                    switchChar = !switchChar;
                }
                if((j == 0 || j == value-1) && i != 0 && i != value-1)
                {
                    System.out.print(switchChar ? character : 'o');
                    if(switchChar) System.out.print(' ');
                    switchChar = !switchChar;
                }
                if(j != 0 && j != value-1 && i != 0 && i != value-1)
                {
                    System.out.print(' ');
                    System.out.print(' ');
                }
                if(i == value-1)
                {
                    System.out.print(switchChar ? character : 'o');
                    System.out.print(' ');
                    switchChar = !switchChar;
                }
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}