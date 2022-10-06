package study.day3.collection;

import java.io.File;
import java.io.FileReader;

public class FileExercise {
    public static void main(String[] args) {

        File dir = new File("./");
        File files[] = dir.listFiles();
        for(File file : files){
            System.out.println(file);
        }
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
