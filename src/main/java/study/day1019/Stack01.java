package study.day1019;

public class Stack01 {
    private int[] arr = new int[10000];
    private  int pointer = 0;
    public Stack01(){}
    public Stack01(int size){
        this.arr=new int[size];
    }
    public void push(int value){

        this.arr[this.pointer] = value;
        this.pointer ++;

    }
}
