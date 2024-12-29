package Data_Structures;

public class DoublyLL {

    private Node head;
    private Node tail;
    private int size;

    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
        this.value =value;
        }

        public Node(int value, Node next, Node prev){
            this.value = value;
            this.next =next;
            this.prev = prev;
        }
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;   // update new node next pointer to the current head
        node.prev = null;   // set the prev pointer of the new node to null (as it will be the first node)
        if(head != null){
            head.prev = node; // If list not empty, update the current head's prev pointer to point the new node.
        }
        head = node; // update head to point the new node
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value +  " ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertLast(int value){
        Node node = new Node(value); // new node
        node.next = null;           // Initializing the new node's next to null, As it will be the last node.
        if(head == null){           // when list is empty
            node.prev = null;
            head = node;
            return;
        }
        Node last = head;            // Traverse to the last node of the list.
        while(last.next != null){
            last = last.next;// keep moving until you reach the last node.
        }
        // Link the new node to the last node
        last.next = node;   // update the next pointer of the current last node.
        node.prev= last;    // update the prev pointer of the new node to point to the last node.
    }

    private void revDisplay(){
        Node temp = head;        // start with the head of the list
        Node last = null;       // variable to store the last node

        // Traverse the list forward and print values
        while(temp != null){
            System.out.print(temp.value + " => "); // print the current node's value
            last = temp;       // update the last node reference which is used in 2nd loop
            temp = temp.next;  // move to the next
        }
        System.out.println("END");

        // Traverse the list backward
        while(last != null){
            System.out.print(last.value + " => "); // Print the current node's value
            last = last.prev;     // move to the previous node
        }
        System.out.println("START");
    }

    public Node find(int value){
        Node node =head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert(int index, int value){
        Node temp = find(index);  // find the node at the specified index
        if(temp == null){    // handle the case where the node does not exist
            System.out.println("Does not exist");
            return;
        }
        Node node = new Node(value);   // new node with value
        // swapping
        node.next =temp.next;   // update new node's next pointer to point the next node of temp
        temp.next = node;       // update the next pointer of temp to point to the new node
        node.prev = temp;       // update the prev node of new node to point to temp
        if(node.next != null){  // If the new node's next is not null, update the prev pointer of the subsequent node.
            node.next.prev = node;  // node's next nodes prev pointer after linking
        }
    }

    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.display();
        list.insert(5,11);
        list.revDisplay();
    }

}
