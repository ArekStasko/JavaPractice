public class GeometrySum {
    public static void Run(){
        int n = 0;
        int wrt = 1;
        while (n < 10){
            if(n == 0) System.out.println(1);
            System.out.println(1/(Math.pow(2,n)));
            System.out.println(n*wrt);
            n++;
        }
    }
}
