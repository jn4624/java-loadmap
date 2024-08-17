package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    /*
      영어 단어를 입력하면 한글 단어를 찾아주는 영어 사전 만들기.
       - 먼저 영어 단어와 한글 단어를 사전에 저장하는 단계
       - 이후에 단어를 검색
     */
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("==단어 입력 단계==");
        while (true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
            String englishWord = scanner.nextLine();

            if (englishWord.equals("q")) {
                break;
            }

            System.out.print("한글 뜻을 입력하세요: ");
            String koreaWord = scanner.nextLine();
            dictionary.put(englishWord, koreaWord);
        }
        System.out.println();

        System.out.println("==단어 검색 단계==");
        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            String searchWord = scanner.nextLine();

            if (searchWord.equals("q")) {
                break;
            }

            if (dictionary.containsKey(searchWord)) {
                System.out.println(searchWord + "의 뜻: " + dictionary.get(searchWord));
            } else {
                System.out.println(searchWord + "은(는) 사전에 없는 단어입니다.");
            }
        }
    }
}
