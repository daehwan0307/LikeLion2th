package algorithm;

import java.util.Scanner;

public class Stack {

    private  int top;
    private  int stackSize;
    private  char stackArr[];
    
    //생성자
    public Stack(int stackSize){
        top=-1;
        this.stackSize=stackSize;
        stackArr= new char[this.stackSize];

    }

    public char pop(){

    }

    public char push(int item){}

    public boolean isEmpty(){
      if(true)
          return true;
      else
          return false;
    }

    public void clear(){
    }

    public char peek(){

    }

    public String printStack(){

        if()
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("스택 사이즈를 입력하시오:");
        int stackSize= sc.nextInt();

        Stack stack = new Stack(stackSize);
        stack.push('A');
        stack.printStack();

        stack.push('B');
        stack.printStack();

        stack.push('C');
        stack.printStack();

        stack.pop();
        stack.printStack();

        stack.pop();
        stack.printStack();

        stack.peek();
        stack.printStack();

        stack.clear();
        stack.printStack();
    }
}
