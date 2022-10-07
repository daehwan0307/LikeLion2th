package study.day1007;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        return new PopulationMove(splittedLine[0],splittedLine[1]);
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
    
    //파일 생성하기
    public void createAFile(String filename){
        File file = new File(filename);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public  void write(List<String> strs, String filename){
        File file = new File(filename);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (String str : strs) {
                writer.write(str);
            }
            writer.close();
        }catch (IOException e){
            e.printStackTrace();

        }

    }
    public String fromToString(PopulationMove populationMove){
        return populationMove.getFromSido()+","+ populationMove.getToSido()+"\n";
    }

    public Map<String,Integer> getMoveCntMap(List<PopulationMove> pml){
        Map<String,Integer> moveCntMap = new HashMap<>();
        for(PopulationMove pm : pml){
            String key = pm.getFromSido()+","+pm.getToSido();
            if(moveCntMap.get(key)==null){
                moveCntMap.put(key,1);
            }
            moveCntMap.put(key,moveCntMap.get(key)+1);
        }
        return  moveCntMap;
    }

    public Map
    public static void main(String[] args) throws IOException {

        String address = "./from_to.txt";
        PopulationStatistics ps = new PopulationStatistics();
        List<PopulationMove> pml = ps.readByLine(address);
        ///

        Map<String,Integer> map = ps.getMoveCntMap(pml);
        String targetFilename = "for_heatmap.txt";
        ps.createAFile(targetFilename);
        List<String> cntResult = new ArrayList<>();
        for(String key : map.keySet()){
            String[] fromto = key.split(",");
            //매핑 후 저장
            String s = String.format("%s, %s, %d\n",fromto[0],fromto[1],map.get(key));
            cntResult.add(s);

        }
        ps.write(cntResult,targetFilename);


    }
}
