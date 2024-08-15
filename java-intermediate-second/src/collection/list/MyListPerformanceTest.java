package collection.list;

public class MyListPerformanceTest {
    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("== MyArrayList 추가 ==");
        addFirst(new MyArrayList<>(), size);
        addMid(new MyArrayList<>(), size);
        // 조회용 데이터로 사용
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        addLast(arrayList, size);
        System.out.println();

        System.out.println("== MyLinkedList 추가 ==");
        addFirst(new MyLinkedList<>(), size);
        addMid(new MyLinkedList<>(), size);
        // 조회용 데이터로 사용
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        addLast(linkedList, size);
        System.out.println();

        int loop = 10_000;
        System.out.println("== MyArrayList 조회 ==");
        getIndex(arrayList, loop, 0);
        getIndex(arrayList, loop, size / 2);
        getIndex(arrayList, loop, size - 1);
        System.out.println();

        System.out.println("== MyLinkedList 조회 ==");
        getIndex(linkedList, loop, 0);
        getIndex(linkedList, loop, size / 2);
        getIndex(linkedList, loop, size - 1);
        System.out.println();

        System.out.println("== MyArrayList 검색 ==");
        search(arrayList, loop, 0);
        search(arrayList, loop, size / 2);
        search(arrayList, loop, size - 1);
        System.out.println();

        System.out.println("== MyLinkedList 검색 ==");
        search(linkedList, loop, 0);
        search(linkedList, loop, size / 2);
        search(linkedList, loop, size - 1);
    }

    private static void search(MyList<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("findValue: " + findValue + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void getIndex(MyList<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < loop; i++) {
            list.get(index);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("index: " + index + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void addLast(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            // 뒤에 추가
            list.add(i);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("뒤에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void addMid(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            // 평균 추가
            list.add((i / 2), i);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("평균 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void addFirst(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            // 앞에 데이터 추가
            list.add(0, i);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}
