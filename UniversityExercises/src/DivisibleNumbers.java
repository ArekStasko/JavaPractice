public class DivisibleNumbers {
    public static void Run() {
        int range = -1500;
        while(range <= 1500) {
            if(range%3 == 0 && range%2 == 0) System.out.println(range);
            range++;
        }
    }
}
