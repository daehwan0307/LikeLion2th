package study.day1007;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PopulationStatistics {

    public  void readByLine2(String filename)throws IOException{
        try(BufferedReader br = Files.newBufferedReader(Paths.get(filename), StandardCharsets.UTF_8)) {

            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    public void readByLine(String filename) throws IOException{
        BufferedReader reader = new BufferedReader(
                new FileReader(filename)
        );
        String str=reader.readLine();

        reader.close();
        System.out.println(str);

    }


    public  void readByChar(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);

        String fileContents=""; //출력내용 초기화

        while(fileContents.length()<1000000){ //100만글자 읽기
            char c = (char)fileReader.read();
            fileContents+= c;
        }
        System.out.println(fileContents);
        //1byte 읽기

    }
    public PopulationMove parse(String data) throws IOException{
        BufferedReader reader = new BufferedReader(
                new FileReader(data)
        );
        String str=reader.readLine();
        reader.close();
        String[] newStr = str.split("[,]");
        int a = Integer.valueOf(newStr[0]);
        int b = Integer.valueOf(newStr[6]);
        return new PopulationMove(a,b);
    }
    public static void main(String[] args) throws IOException {
        String address = "C:\\Users\\daehwan\\Desktop\\2021_인구관련연간자료_20220927_66125.csv";

        PopulationStatistics populationStatistics = new PopulationStatistics();
        populationStatistics.readByLine(address);

    }
}
