package calculator;

public class Main {
    public static void main(String[] args) {
        NumberMaker numberMaker = new RandomNumberMaker(); //방법1
        Calculator randomNumberCalculator = new Calculator(numberMaker);
        randomNumberCalculator.plus(20);


        Calculator byPassNumberCalculator = new Calculator(new ByPassNumberMaker()); //방법 2
        Calculator byPassNumberCalculator1 = new Calculator(new ByPassNumberMaker(),10); //방법 2
        byPassNumberCalculator.plus(30);
        byPassNumberCalculator1.plus(20);
    }
}
