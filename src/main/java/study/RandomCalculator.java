package study;

public class RandomCalculator {

    int a;
    int b = (int)(Math.random()*100);

    public void plus(int a){
        System.out.println(a+b);
    }
    public void minus(int a){
        System.out.println(a-b);
    }
    public void multiple(int a){
        System.out.println(a*b);
    }
    public void divide(int a){
        if(b==0){
            System.out.println("랜덤 숫자가 0 입니다.");
        }
        else
            System.out.println((double)a/b);
    }
}
