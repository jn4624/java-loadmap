package collection.set.test;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNamesTest3 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        // 코드 작성
        Set<Integer> set = new TreeSet<>(List.of(inputArr));
        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}
