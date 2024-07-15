package lang.wrapper;

/**
 * 기본형의 한계
 *
 * 기본형은 항상 값을 가져야 한다.
 * 하지만 때로는 데이터가 "없음" 이라는 상태가 필요할 수 있다.
 *
 * 실행 결과를 보면 입력 값이 -1 일때 -1을 반환한다.
 * 그런데 배열에 없는 값인 100을 입력해도 같은 -1을 반환한다.
 * 입력값이 -1일 때를 생각해보면, 배열에 -1 값이 있어서 -1을 반환한 것인지,
 * 아니면 -1 값이 없어서 -1을 반환한 것인지 명확하지 않다.
 *
 * 객체의 경우 데이터가 없다는 null 이라는 명확한 값이 존재한다.
 */
public class MyIntegerNullMain0 {
    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};

        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100));
    }

    private static int findValue(int[] intArr, int target) {
        for (int value : intArr) {
            if (value == target) {
                return value;
            }
        }
        return -1;
    }
}
