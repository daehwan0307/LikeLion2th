package study.day1019;

public class Stack01 {
    private int[] arr = new int[10000];
    private  int top = 0;
    public Stack01(){}
    public Stack01(int size){
        this.arr=new int[size];
    }
    public void push(int value){

        this.arr[this.top] = value;
        this.top ++;

    }
    public int[] getArr(){
        return arr;
    }

    public int pop(){
        int value = this.arr[this.top-1];

        this.top--;
        return value;
    }
}
