public class KCount {
    public void Run(){
        int K = 987654321;
        String s = "";

        while(K != 0){
            int cyfra = K % 10;
            s = s + cyfra;
            K = K / 10;
        }

        System.out.println(s);
        System.out.println(K);
    }

}
