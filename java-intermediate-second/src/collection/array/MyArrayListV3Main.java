package collection.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        // 마지막에 추가 O(1)
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        System.out.println();

        // 원하는 위치에 추가
        System.out.println("addLast");
        list.add(3, "addList"); // O(1)
        System.out.println(list);
        System.out.println();

        System.out.println("addFirst");
        list.add(0, "addFirst"); // O(n)
        System.out.println(list);
        System.out.println();

        // 삭제
        Object removed1 = list.remove(4);// remove last O(1)
        System.out.println("remove(4) = " + removed1);
        System.out.println(list);
        System.out.println();

        Object removed2 = list.remove(0);// remove first O(n)
        System.out.println("remove(0) = " + removed2);
        System.out.println(list);
    }
}
