public class MethodCurrier {

    public void SetValue(int value)
    {
        DisplayName(value);
        value++;
        DisplayName(value);
    }

    public void SetValue(float value)
    {
        DisplayName(value);
        value++;
        DisplayName(value);
    }

    public void SetValue(Number value)
    {
        DisplayName(value);
        value.SetValue(3);
        DisplayName(value);
    }

    private <T> void DisplayName(T value)
    {
        System.out.println("Value: " + value + " type: " + ((Object)value).getClass().getName());
    }

    private void DisplayName(Number value)
    {
        System.out.println("Value: " + value.Num + " type: " + ((Object)value).getClass().getName());
    }
}
