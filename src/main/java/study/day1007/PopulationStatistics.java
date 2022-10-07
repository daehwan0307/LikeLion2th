package study.day1007;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

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
    public List<PopulationMove> readByLine(String filename) throws IOException{

        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader reader = new BufferedReader(
                new FileReader(filename)
        );
        String str;
        while ((str=reader.readLine())!=null){
        //    System.out.println(str);
            PopulationMove pm = parse(str);
            pml.add(pm);

        }
        reader.close();
        return pml;

    }
    public PopulationMove parse(String data){
        //String data="11,110,51500,2021,01,04,11,110,51500,5,1,033,1,,,,,,,,,,,,,,,,,,,,,,,,,,,,9";
        //csv
        String[] splittedLine = data.split(",");
        return new PopulationMove(splittedLine[6],splittedLine[0]);
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

    public static void main(String[] args) throws IOException {
        String address = "C:\\Users\\daehwan\\Desktop\\2021_인구관련연간자료_20220927_66125.csv";

        PopulationStatistics populationStatistics = new PopulationStatistics();
        List<PopulationMove> pml = populationStatistics.readByLine(address);
        System.out.println(pml.size());
    }
}
