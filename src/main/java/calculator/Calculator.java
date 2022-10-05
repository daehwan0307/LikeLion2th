package calculator;

public class Calculator {
    //NumberMaker에서 만들어준 숫자를 가지고
    // 사칙 연산한 결과를 출력한다.

    private  int baseNum;
    private NumberMaker numberMaker;

    public Calculator(NumberMaker numberMaker) {
        this.numberMaker = numberMaker;
        this.baseNum = 10;
    }
    public Calculator(NumberMaker numberMaker,int baseNum) {
        this.numberMaker = numberMaker;
        this.baseNum = baseNum;
    }

    public void plus(int num){
        System.out.println(num+numberMaker.make(baseNum));

    }
}
