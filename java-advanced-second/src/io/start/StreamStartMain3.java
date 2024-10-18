package io.start;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
  부분으로 나누어 읽기 - read(byte[], offset, length)
  - 스트림의 내용을 부분적으로 읽거나, 읽은 내용을 처리하면서 스트림을 계속해서 읽어야 할 경우에 적합.
  - 파일이나 스트림에서 일정한 크기의 데이터를 반복적으로 읽어야 할 때 유용.
  - 메모리 사용량을 제어.
  - 100M의 파일을 1M 단위로 나누어 읽고 처리하는 방식을 사용하면 한번에 최대 1M의 메모리만 사용.
  - 예) 대용량 파일을 처리할 때, 한번에 메모리에 로드하기 보다는 이 메서드를 사용하여 파일을 조각조각 읽어들일 수 있다.
 */
public class StreamStartMain3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("temp/hello.dat");
        byte[] input = {65, 66, 67};
        fos.write(input);
        fos.close();

        FileInputStream fis = new FileInputStream("temp/hello.dat");
        byte[] buffer = new byte[10];
        int readCount = fis.read(buffer, 0, 10);
        System.out.println("readCount = " + readCount);
        System.out.println(Arrays.toString(buffer));
        fis.close();
    }
}
