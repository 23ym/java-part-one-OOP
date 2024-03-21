public class MainOperationsPrimitives {
    public static void main(String[] args) {
        long longValue = 50;
        int intValue = 29;
        byte byteValue = 89;
        short shortValue = 130;
        float floatValue = 180.98f;
        double doubleValue = 348.98;

        int result1 = byteValue + shortValue;
        long result2 = longValue + intValue;
        double result3 = floatValue + doubleValue;
        double result4 = intValue + doubleValue;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        sumOfByteAndShort(byteValue, shortValue);
        sumOfFloatAndDouble(floatValue, doubleValue);
        sumOfIntAndLong(intValue, longValue);
        sumOfIntAndDouble(intValue, doubleValue);
    }

    public static void sumOfIntAndDouble(int intValue, double doubleValue) {
        System.out.println(intValue + doubleValue);
    }

    public static void sumOfFloatAndDouble(float floatValue, double doubleValue) {
        System.out.println(floatValue + doubleValue);
    }

    public static void sumOfByteAndShort(byte byteValue, short shortValue) {
        System.out.println(byteValue + shortValue);
    }
    public  static void sumOfIntAndLong(int intValue, long longValue) {
        System.out.println(intValue + longValue);
    }
}
