package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        // 각각의 단어가 나타난 수 출력 - 코드 작성
        String[] words = text.split(" ");
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            Integer count = wordMap.get(word);
            if (count == null) {
                count = 0;
            }
            count++;
            wordMap.put(word, count);
        }
        System.out.println(wordMap);
    }
}
