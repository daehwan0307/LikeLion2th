package calculator;

public class ByPassNumberMaker implements  NumberMaker{
    @Override
    public int make(int num) {
        return num;
    }
}
