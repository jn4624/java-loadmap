package lang.math;

import java.util.Random;

/**
 * 씨드 - Seed
 * Seed 가 같으면 실행 결과는 반복 실행해도 같다.
 *
 * new Random()
 * - 생성자를 비워두면 내부에서 System.nanoTime()에 여러가지 복잡한 알고리즘을 섞어서 씨드값을 생성한다.
 * - 따라서 반복 실행해도 결과가 항상 달라진다.
 *
 * new Random(int seed)
 * - 생성자에 씨드 값을 직접 전달할 수 있다.
 * - 씨드 값이 같으면 여러번 반복 실행해도 실행 결과가 같다.
 * - 이렇게 씨드 값을 직접 사용하면 결과 값이 항상 같기 때문에 결과가 달라지는 랜덤 값을 구할 수 없다.
 * - 하지만 결과가 고정되기 때문에 테스트 코드 같은 곳에서 같은 결과를 검증할 수 있다.
 */
public class RandomMain {
    public static void main(String[] args) {
        Random random = new Random();
//        Random random = new Random(1); // seed가 같으면 Random의 결과가 같다.

        int randomInt = random.nextInt();
        System.out.println("randomrInt = " + randomInt);

        double randomDouble = random.nextDouble();
        System.out.println("randomDouble = " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);

        // 범위 조회
        int randomRange1 = random.nextInt(10);// 0 ~ 9까지 출력
        System.out.println("randomRange1 = " + randomRange1);

        int randomRange2 = random.nextInt(10) + 1;// 1 ~ 10까지 출력
        System.out.println("randomRange2 = " + randomRange2);
    }
}
