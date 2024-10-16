public class IntegerConvertion {

    public void DisplayNumConversions(int num)
    {
        String binary = Integer.toBinaryString(num);
        String octal = Integer.toOctalString(num);
        String hex = Integer.toHexString(num);

        System.out.println(binary);
        System.out.println(octal);
        System.out.println(hex);
    }
}
