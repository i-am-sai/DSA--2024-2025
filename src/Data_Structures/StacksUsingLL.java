package Data_Structures;

// class representing a node in the liked list


// class to implement stack using singly linked list
class Stack{
    Node head;

    Stack(){
        this.head =null;  // constructor to initialize the stack
    }

    //Op1 : isEmpty()
    boolean isEmpty(){
        return head == null;
    }

    //Op2 : push()
    void push(int new_data){
        Node new_node = new Node(new_data);
        // Checks memory
        if(new_node == null){
            System.out.println("\nStack Overflow");
            return;
        }
        new_node.next = head; // Link the new node to current top node
        head = new_node;  // Update the new node as head
    }

    //op3 :pop()
    void pop(){
        if(isEmpty()){
            System.out.println("\n Stack Underflow");
            return;
        }
        else{
            Node temp = head;  // assign the  current top to a temp variable
            head = head.next;  // update the top to the next node
            temp = null;   // Deallocate the memory of the old top node
        }
    }

    //op4: peek()
    int peek(){
        if(!isEmpty()){
            return head.data;
        }
        else{
            System.out.println("\nStack is empty");
            return Integer.MIN_VALUE;
        }
    }
    void display(){
        Node temp =head;
        while(!isEmpty()){
            System.out.print(temp + "->");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class StacksUsingLL {
    public static void main(String[] args) {

        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.display();

    }
}
