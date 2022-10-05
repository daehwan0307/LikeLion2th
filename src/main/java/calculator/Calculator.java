package calculator;

public class Calculator {
    //NumberMaker에서 만들어준 숫자를 가지고
    // 사칙 연산한 결과를 출력한다.

    private NumberMaker numberMaker;

    public Calculator(NumberMaker numberMaker) {
        this.numberMaker = numberMaker;
    }

    public void plus(int num){
        int result = num + this.numberMaker.make(10);
        System.out.println(result);

    }
}
