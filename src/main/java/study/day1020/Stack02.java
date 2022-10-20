package study.day1020;

import java.util.EmptyStackException;

public class Stack02 {

    private Integer[] arr;
    private int top = 0; // 0번째 -> 0으로 초기화


    public Stack02(){
        this.arr = new Integer[10000];
        // 기본은 10000개의 array로 설정하게 빈 constructor를 설정함
    }

    public Stack02(int size){
        this.arr = new Integer[size];
    }

    public Integer[] getArr(){
        return arr;
    }

    public Integer[] push(int value){
        this.arr[top] = value;
        this.top++; // 0번에 넣고 1번으로 올리고
        return arr;
    }

    public int pop(){
        if (this.isEmpty()){
            throw new EmptyStackException();
        }

        int value = arr[this.top-1];
        this.top--;
        return value;
    }


    public boolean isEmpty() {
        boolean isEmpty = this.top == 0;
        return isEmpty;
    }
}
