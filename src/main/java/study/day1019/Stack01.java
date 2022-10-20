package study.day1019;

import java.util.EmptyStackException;

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
        if(this.isEmpty()){
            throw new EmptyStackException();
        }
        return this.arr[--this.top];
    }
    public boolean isEmpty(){
        boolean isEmpty = this.top==0;
                return isEmpty;
    }
}
