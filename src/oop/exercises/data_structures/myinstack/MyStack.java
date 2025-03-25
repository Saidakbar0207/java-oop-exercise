package oop.exercises.data_structures.myinstack;

public class MyStack {
    private int[] contents;
    private int tos;
    public MyStack(int capacity){
        contents=new int[capacity];
        tos=-1;
    }
    public void push(int item){
        contents[++tos]=item;
    }
    public int pop(){
        return contents[tos--];
    }
    public int peek(){
        return contents[tos];
    }
    public boolean isEmpty(){
        return tos<0;
    }
    public boolean isFull(){
        return tos==contents.length-1;
    }
}
