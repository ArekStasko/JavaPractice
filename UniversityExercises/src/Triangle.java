public class Triangle {
    public static void Run(int asterikCount){
        String asterikValue = "";
        for(int i = 1; i < asterikCount; i++){
            if(i%2==0)continue;
            asterikValue = "*".repeat(i);
            int rest = (asterikCount - i)/2;
            asterikValue = " ".repeat(rest) + asterikValue;
            System.out.println(asterikValue);
        }
    }
}
