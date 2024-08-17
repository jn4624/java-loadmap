package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum1 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        // map1 과 map2 에 공통으로 들어 있는 키 찾고 값의 합 출력 - 코드 작성
        Map<String, Integer> resultMap = new HashMap<>();
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                resultMap.put(key, map1.get(key) + map2.get(key));
            }
        }
        System.out.println(resultMap);
    }
}
