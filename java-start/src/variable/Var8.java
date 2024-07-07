package variable;

public class Var8 {
    public static void main(String[] args) {
        // 정수
        byte b = 127; // -128 ~ -127 (1byte)
        short s = 32767; // -32,768 ~ 32,767 (2byte)
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 약 20억(4byte)
        long l = 9223372036854775807L; // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 (8byte)

        // 실수
        float f = 10.0f; // 7자리 정밀도(4byte)
        double d = 10.0; // 15자리 정밀도(8byte)

        /**
         * 기타
         * - boolean: (1byte)
         * - char: (2byte)
         * - String: 문자 길이에 따라 동적으로 달라진다.
         */
    }
}
