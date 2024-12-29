package Data_Structures;

public class CircularLL {

    private class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
        Node(int val, Node next){
            this.val =val;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    public CircularLL(){
        this.head = null;
        this.tail = null;
    }

    //Insertion
    public void insert(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    //Display
    public void display(){
        Node temp = head;
        if(head != null){
            do{
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }while(temp != head);
            System.out.println();
        }
    }

    //Delete
    public void delete(int value){
        Node node = head;
       if(node == null){
           return;
       }
       if(node.val == value){
           head = head.next;
           tail.next = head;
           return;
       }
       do{
           Node n = node.next;
           if(n.val == value){
               node.next = n.next;
               break;
           }
           node = node.next;
       }while(node != head);
    }

    public static void main(String[] args) {
        CircularLL list = new CircularLL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.display();
        list.delete(2);
        list.display();
    }
}
