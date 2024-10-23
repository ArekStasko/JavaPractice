public class TypesComparison {
    boolean logicPositive = true;
    boolean logicNegative = false;

    byte byteValue = 10;
    short shortValue = 20;
    int intValue = 30;
    long longValue = 40;

    float floatValue = 50.2f;
    double doubleValue = 60.25;

    char charValue = 'A';

    void PrintComparisons()
    {
        System.out.println(logicPositive == logicPositive);
        //System.out.println(logicPositive == logicNegative);
        //System.out.println(logicPositive == byteValue);
        //System.out.println(logicPositive == shortValue);
        //System.out.println(logicPositive == intValue);
        //System.out.println(logicPositive == longValue);
        //System.out.println(logicPositive == floatValue);
        //System.out.println(logicPositive == doubleValue);
        //System.out.println(logicPositive == charValue);

        System.out.println(logicNegative == logicNegative);
        //System.out.println(logicNegative == byteValue);
        //System.out.println(logicNegative == shortValue);
        //System.out.println(logicNegative == intValue);
        //System.out.println(logicNegative == longValue);
        //System.out.println(logicNegative == floatValue);
        //System.out.println(logicNegative == doubleValue);
        //System.out.println(logicNegative == charValue);

        System.out.println(byteValue == byteValue);
        System.out.println(byteValue == shortValue);
        System.out.println(byteValue == intValue);
        System.out.println(byteValue == longValue);
        System.out.println(byteValue == floatValue);
        System.out.println(byteValue == doubleValue);
        System.out.println(byteValue == charValue);

        System.out.println(shortValue == shortValue);
        System.out.println(shortValue == intValue);
        System.out.println(shortValue == longValue);
        System.out.println(shortValue == floatValue);
        System.out.println(shortValue == doubleValue);
        System.out.println(shortValue == charValue);

        System.out.println(intValue == intValue);
        System.out.println(intValue == longValue);
        System.out.println(intValue == floatValue);
        System.out.println(intValue == doubleValue);
        System.out.println(intValue == charValue);

        System.out.println(longValue == longValue);
        System.out.println(longValue == floatValue);
        System.out.println(longValue == doubleValue);
        System.out.println(longValue == charValue);

        System.out.println(floatValue == floatValue);
        System.out.println(floatValue == doubleValue);
        System.out.println(floatValue == charValue);

        System.out.println(doubleValue == doubleValue);
        System.out.println(doubleValue == charValue);

        System.out.println(charValue == charValue);
    }
}
