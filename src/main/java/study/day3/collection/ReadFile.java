package study.day3.collection;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {

        int count = 0;
        FileReader reader = new FileReader("./file");

        char c = (char) reader.read();
        
        System.out.println(c);
    }
}
