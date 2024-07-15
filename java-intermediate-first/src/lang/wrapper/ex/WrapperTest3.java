package lang.wrapper.ex;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        Integer integerValue1 = Integer.valueOf(str);
        System.out.println("integerValue1 = " + integerValue1);

        int intValue = integerValue1.intValue();
        System.out.println("intValue = " + intValue);

        Integer integerValue2 = Integer.valueOf(intValue);
        System.out.println("integerValue2 = " + integerValue2);
    }
}
