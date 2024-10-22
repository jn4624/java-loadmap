package io.file.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
  파일 복사 예제2
  - InputStream 에는 transferTo()라는 특별한 메서드 존재.
  - 이 메서드는 InputStream 에서 읽은 데이터를 바로 OutputStream 으로 출력.
  - transferTo()는 성능 최적화가 되어 있기 때문에, 파일 복사 예제1과 비슷하거나 조금 더 빠르다.
    * 상황에 따라 조금 더 느릴 수 있다.
    * 참고로 디스크는 실행시 시간의 편차가 심하다는 점을 알아두자.
  - 파일(copy.dat) -> 자바(bytes) -> 파일(copy_new.dat)의 과정.
 */
public class FileCopyMainV2 {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("temp/copy.dat");
        FileOutputStream fos = new FileOutputStream("temp/copy_new.dat");
        fis.transferTo(fos);
        fis.close();
        fos.close();

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken = " + (endTime - startTime) + "ms");
    }
}
