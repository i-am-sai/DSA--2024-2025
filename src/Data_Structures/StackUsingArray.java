package Data_Structures;

public class StackUsingArray {
    static final int MAX = 1000;
    int top;
    int arr[] = new int[MAX];

    StackUsingArray(){
        top = -1;
    }

    //operation 1 : push()
    boolean push(int value){
        if(top >= (MAX -1)){
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            arr[++top] = value;
            System.out.println(value + " pushed into the stack");
            return true;
        }
    }

    //operation 2 : pop()
    int pop(){
        if(top < 0){
            System.out.println(" Stack Underflow");
            return 0;
        }
        else{
            int value = arr[top--];
            return value;
        }
    }

    //operation 3 : isEmpty
    boolean isEmpty() {
       return (top<0);
    }

    //isFull
    boolean isFull(){
        return (top>=MAX);
    }

    //operation 4: peek()
    int peek(){
        if(top <0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int value = arr[top];
            return value;
        }
    }

    void print(){
        for(int i =top; i>-1; i--){
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.print();
        System.out.println("popped element " + stack.pop());
        System.out.println("Element present at top : " + stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
    }
}