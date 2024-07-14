package lang.string.builder;

/**
 * String 최적촤가 어려운 이유
 * 루프안에서 문자열을 더하는 경우에는 최적화가 이루어지지 않는다.
 *
 * 반복문 루프 내부에서는 최적화가 되는 것처럼 보이지만, 반복 횟수만큼 객체를 생성해야 한다.
 * 반복문 내부에서의 문자열 연결은, 런타임에 연결할 문자열의 개수와 내용이 결정된다.
 * 이런 경우, 컴파일러는 얼마나 많은 반복이 일어날지, 각 반복에서 문자열이 어떻게 변할지 예측할 수 없다.
 * 따라서, 이런 상황에서는 최적화가 어렵다.
 *
 * 이럴 때는 직접 StringBuilder 를 사용하면 된다.
 */
public class LoopStringMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        String result = "";
        for (int i = 0; i < 100000; i++) {
            result += "Hello Java ";
        }

        long endTime = System.currentTimeMillis();

        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime) + "ms");
    }
}
