//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IntegerConvertion integerConverter = new IntegerConvertion();
        BitShifter bitshifter = new BitShifter();
        LiteralBitReader literalBitReader = new LiteralBitReader();
        XyzExercise xyzExercise = new XyzExercise();
        //integerConverter.DisplayNumConversions(165);
        //bitshifter.ShiftBit(14);
        //literalBitReader.ReadLiteralData(-70);
        xyzExercise.Run();
    }
}