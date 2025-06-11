import java.util.Scanner;

public class StackImp {
    int arr[];
    int top;
    int capacity;

    StackImp(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public static void main(String[] arg){
        StackImp myStack = new StackImp(5);

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);
        myStack.size();
        myStack.push(60);
        myStack.showStack();
        myStack.pop();
        myStack.showStack();
        myStack.pop();
        myStack.showStack();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.showStack();

    }

    boolean isFull(){
        return top + 1 == capacity;
    }
    boolean isEmpty(){
        return top == -1;
    }
    void size(){
        System.out.println("Stack size is "+(top+1));
    }
    void push(int x){
        if(isFull()){
            System.out.println("Stack is full, can not insert more");
        }else {
            top++;
            arr[top] = x;
            System.out.println(x+" inserted");
        }
    }

    void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty, no element to remove");
        }else{
            System.out.println(arr[top]+" removed");
            top--;
        }
    }

    void showStack(){
        if(isEmpty()){
            System.out.println("Stack is empty, no element to show");
        }else {
            System.out.println("MyStack Output");
            for (int i=0; i<=top; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println("");
        }
    }
}
