package io.start;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
  전체 읽기 - readAllBytes()
  - 한번의 호출로 모든 데이터를 읽을 수 있어 편리.
  - 작은 파일이나 메모리에 모든 내용을 올려서 처리해야 하는 경우에 적합.
  - 메모리 사용량을 제어할 수 없다.
  - 큰 파일의 경우 OutOfMemoryError 발생 가능성.
 */
public class StreamStartMain4 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("temp/hello.dat");
        byte[] input = {65, 66, 67};
        fos.write(input);
        fos.close();

        FileInputStream fis = new FileInputStream("temp/hello.dat");
        byte[] readBytes = fis.readAllBytes();
        System.out.println(Arrays.toString(readBytes));
        fis.close();
    }
}
