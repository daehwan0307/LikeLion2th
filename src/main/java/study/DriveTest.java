package study;

interface Printable{
    public abstract void print(String doc);

}

class SPrinterDriver implements  Printable{

    @Override
    public void print(String doc) {
        System.out.println("삼성 프린터 입니다.");
        System.out.println(doc);
    }
}

class LPrinterDriver implements  Printable{

    @Override
    public void print(String doc){
        System.out.println("엘쥐 프린터 입니다.");
        System.out.println(doc);
    }

}

public class DriveTest {
    public static void main(String[] args) {
        Printable prn = new SPrinterDriver();
        prn.print("출력해주세요.");

        prn = new LPrinterDriver();
        prn.print("출력해주세요.");
    }
}

