package lang.math.ex;

import java.util.Random;

public class LottoGenerator {
    private Random random = new Random();
    private int[] lottoNumbers;
    private int count;

    public int[] generate() {
        lottoNumbers = new int[6];
        count = 0;

        while (count < 6) {
            int number = random.nextInt(45) + 1;

            if (isUnique(number)) {
                lottoNumbers[count++] = number;
            }
        }
        return lottoNumbers;
    }

    public boolean isUnique(int number) {
        for (int lottoNumber : lottoNumbers) {
            if (lottoNumber == number) {
                return false;
            }
        }
        return true;
    }
}
