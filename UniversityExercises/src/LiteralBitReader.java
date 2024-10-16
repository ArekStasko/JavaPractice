public class LiteralBitReader {
    public void ReadLiteralData(int literal)
    {
        int mask = 0b11111;
        System.out.println(Integer.toBinaryString(mask & literal));

        int singleMask = 0b1000000;
        System.out.println(Integer.toBinaryString(singleMask & literal));

        System.out.println(Integer.toBinaryString((literal >> 24) & 0xFF));
        System.out.println(Integer.toBinaryString((literal >> 16) & 0xFF));
        System.out.println(Integer.toBinaryString((literal >> 8) & 0xFF));
        System.out.println(Integer.toBinaryString(literal & 0xFF));

        int twoBytes = (literal >> 8) & 0xFFFF;
        System.out.println(twoBytes);
    }
}
