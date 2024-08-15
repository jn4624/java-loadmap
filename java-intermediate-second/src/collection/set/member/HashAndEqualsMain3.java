package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain3 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        Member m1 = new Member("A");
        Member m2 = new Member("A");

        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));
        System.out.println();

        set.add(m1);
        set.add(m2);
        System.out.println(set);
        System.out.println();

        // 검색 -> 성공
        Member searchValue = new Member("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean result = set.contains(searchValue);
        System.out.println(result);

        // 참고
        String strAa = "Aa";
        String strBB = "BB";

        System.out.println("strAa.hashCode() = " + strAa.hashCode());
        System.out.println("strBB.hashCode() = " + strBB.hashCode());
        System.out.println("strAa.equals(strBB) = " + strAa.equals(strBB));
    }
}
