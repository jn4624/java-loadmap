package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // 정렬 기준으로 최대 값을 찾아서 반환
        Integer max = Collections.max(list);
        // 정렬 기준으로 최소 값을 찾아서 반환
        Integer min = Collections.min(list);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("list = " + list);

        // 컬렉션을 랜덤하게 섞는다
        Collections.shuffle(list);
        System.out.println("shuffle list = " + list);

        // 정렬 기준으로 컬렉션을 정렬
        Collections.sort(list);
        System.out.println("sort list = " + list);

        // 정렬 기준의 반대로 컬렉션을 정렬
        Collections.reverse(list);
        System.out.println("reverse list = " + list);
    }
}
