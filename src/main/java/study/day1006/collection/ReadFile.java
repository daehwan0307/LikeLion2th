package study.day1006.collection;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {

        int count = 0;
        FileReader reader = new FileReader("./file");

        for (int i = 0; i < 2; i++) {
            char c = (char) reader.read();


            System.out.println(c);

        }
    }

}
