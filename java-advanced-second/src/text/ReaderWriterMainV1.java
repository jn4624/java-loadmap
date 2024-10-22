package text;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

import static java.nio.charset.StandardCharsets.UTF_8;
import static text.TextConst.FILE_NAME;

public class ReaderWriterMainV1 {
    public static void main(String[] args) throws IOException {
        String writeString = "ABC";

        // 문자 -> byte UTF-8 인코딩
        byte[] writeBytes = writeString.getBytes(UTF_8);
        System.out.println("Write String = " + writeString);
        System.out.println("Write Bytes = " + Arrays.toString(writeBytes));

        // 파일 쓰기
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        fos.write(writeBytes);
        fos.close();

        // 파일 읽기
        FileInputStream fis = new FileInputStream(FILE_NAME);
        byte[] readBytes = fis.readAllBytes();
        fis.close();

        // byte -> String UTF-8 디코딩
        String readString = new String(readBytes);
        System.out.println("Read Bytes = " + Arrays.toString(readBytes));
        System.out.println("Read String = " + readString);
    }
}
