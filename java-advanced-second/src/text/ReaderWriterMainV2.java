package text;

import java.io.*;

import static java.nio.charset.StandardCharsets.UTF_8;
import static text.TextConst.FILE_NAME;

public class ReaderWriterMainV2 {
    public static void main(String[] args) throws IOException {
        String writeString = "ABC";
        System.out.println("Write String = " + writeString);

        // 파일 쓰기
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        OutputStreamWriter osw = new OutputStreamWriter(fos, UTF_8);
        osw.write(writeString);
        osw.close();

        // 파일 읽기
        FileInputStream fis = new FileInputStream(FILE_NAME);
        InputStreamReader isr = new InputStreamReader(fis, UTF_8);

        StringBuilder readString = new StringBuilder();
        int ch;
        while ((ch = isr.read()) != -1) {
            readString.append((char) ch);
        }
        isr.close();

        System.out.println("Read String = " + readString);
    }
}
