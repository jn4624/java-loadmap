package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetOperationsTest1 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        // 코드 작성
        Set<Integer> treeSet1 = new TreeSet<>(set1);
        treeSet1.addAll(set2);
        System.out.println("합집합: " + treeSet1);

        Set<Integer> treeSet2 = new TreeSet<>();
        for (Integer integer : set2) {
            if (set1.contains(integer)) {
                treeSet2.add(integer);
            }
        }
        System.out.println("교집합: " + treeSet2);

        Set<Integer> treeSet3 = new TreeSet<>();
        for (Integer integer : set1) {
            if (!set2.contains(integer)) {
                treeSet3.add(integer);
            }
        }
        System.out.println("차집합: " + treeSet3);
    }
}
