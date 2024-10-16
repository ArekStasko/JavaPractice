public class XyzExercise {
    public void Run()
    {
        int a1 = 0x6D, a2 = 0xF, a = a1 & a2,
            b1 = 0xA, b2 = 0x05, b = b1 | b2,
            c1 = 11 << 2, c2 = 0x06, c = c1^c2;
        System.out.println(a+" "+b+" "+c);
    }
}
