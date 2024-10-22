package io.file.text;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

import static java.nio.charset.StandardCharsets.UTF_8;

/*
  Files - 라인 단위로 읽기
 */
public class ReadTextFileV2 {
    private static final String PATH = "temp/hello2.txt";

    public static void main(String[] args) throws IOException {
        String writeString = "abc\n가나다";
        System.out.println("== Write string ==");
        System.out.println(writeString);

        Path path = Path.of(PATH);

        // 파일 쓰기
        Files.writeString(path, writeString, UTF_8);

        /*
          파일 읽기
          Files.readAllLines(path): 파일을 한 번에 다 읽고, 라인 단위로 List 에 나누어 저장하고 반환
         */
        System.out.println("== Read string ==");
        List<String> lines = Files.readAllLines(path, UTF_8);
        for (int i = 0; i < lines.size(); i++) {
            System.out.println((i + 1) + " = " + lines.get(i));
        }

        /*
          파일 읽기
          Files.lines(path): 파일을 한 줄 단위로 나누어 읽고, 메모리 사용량을 줄이고 싶다면 이 기능 사용 권장
         */
        try (Stream<String> lineStream = Files.lines(path, UTF_8)) {
            lineStream.forEach(line -> System.out.println(line));
            lineStream.close();
        }
    }
}
