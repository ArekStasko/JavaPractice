public class BitShifter {

    public void ShiftBit(int num)
    {
        int result = num >> 0;
        result = result << 2;
        result = result >> 4;
        System.out.println(result);
    }
}
