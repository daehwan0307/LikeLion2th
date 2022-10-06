package study.day1006.collection;

import java.io.FileReader;
import java.io.IOException;

public class FileExercise {

    public char readAChar(String filename) throws IOException{
        FileReader fileReader = new FileReader(filename);
        return (char)fileReader.read();
    }

    public static void main(String[] args) throws IOException {

        FileExercise fileExercise = new FileExercise();
        char c = fileExercise.readAChar( "./file");
        System.out.println(c);
    }
}
/*
.\.git
.\.gitignore
.\.gradle
.\.idea
.\build
.\build.gradle
.\file
.\gradle
.\gradlew
.\gradlew.bat
.\out
.\README.md
.\settings.gradle
.\src

Process finished with exit code 0

 */
