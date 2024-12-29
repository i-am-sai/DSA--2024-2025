package Data_Structures;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public class Node {

        int value;
        Node next;

        // Constructor to initialize the node with data
        public Node(int value) {
            this.value = value;
            this.next = next;
        }

        public Node(int data, Node next) {
            this.value = data;
            this.next = next;
        }
    }

// 1. Traversal :
// step1 : Initialize pointer current to the head of the list
// step2 : while loop to iterate through the list until the current pointer reaches null
// step3: Inside loop, print the data of the current node and move the current pointer to the next node.

    public static void traversal(Node head){
        Node current = head;
        while(current != null){
            System.out.println(current.value + " ");
            current = current.next;
        }
    }

    //2. Searching in LL :
// step1 : Traverse the LL starting from head
// step2 : Check if current node matches the target value. If yes the return true.
    public boolean find(int value){
        Node current = head;
        while(current != null){
            if(current.value == value){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // 3. Size of the LL:
    public void size(){
        Node current = head;
        int count =0;
        while(current != null){
            count++;
            current = current.next;
        }
        System.out.println(count);
    }

    // 4: Insertion at the Beginning of the Singly LL.
// step1 : create a new node with the given value.
// step2 : set the next pointer of the new node to the current node.
// step3 : Move the head to the new node.
// step4 : Return the head of the linked last.
    public Node insertAtFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head; // set the next pointer of the new node to the current node
        head = newNode;
        if(tail == null){
            tail = head;
        }
        size += 1;
        return head;
    }

    //5: Insertion at the end of the singly LL.
    public void insertAtEnd(int value){
        if(tail == null){
            insertAtFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    //6: Display : A non static method : As i caI use head directly without passing it inside the arguments.
//The static method display() cannot directly access the non-static variable head because head is tied to a specific instance of LinkedList,
// but a static method doesn't belong to any instance.
    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.value + " " );
            current = current.next;
        }
        System.out.println("END!");
    }

    //7: insert with index
    public void insertAtIndex(int value, int index){
        if(index == 0){
            insertAtFirst(value);
            return;
        }
        if(index == size){
            insertAtEnd(value);
            return;
        }
        Node temp = head;
        for(int i=1;i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    //8: DeleteFirst
    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return value;
    }

    //9: Get element from specific index
    public Node get(int index){
        Node node = head;
        for(int i=0; i<index; i++){
            node = node.next;
        }
        return node;
    }

    //10 : DeleteLast
    public int deleteLast(){
        if(size <=1){
            return deleteFirst();
        }
        Node secondLast =get(size-2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        return value;
    }

    // 11: Delete at specific index
    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast(); // Calls the helper method to delete the last node
        }
        Node prev = get(index - 1); // Fetch the node just before the one to delete
        int val = prev.next.value; // Step 4: Store the value of the node to be deleted
        prev.next = prev.next.next; //Update the 'next' pointer to skip the node being deleted
        size--;
        return val;
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insertAtFirst(7);
        list.insertAtFirst(8);
        list.insertAtEnd(9);
        list.size();
        System.out.println(list.find(8));
        list.display();
        list.insertAtIndex(6,1);
        list.insertAtEnd(10);
        list.display();
        list.deleteFirst();
        list.display();

    }
}

//public class Practise{
//
//    class  Node{
//        int data;
//        Node next;    // Complex objects by default value is null
//
//        Node(int value){
//            this.data = value;
//        }
//        Node(int value, Node next){
//            this.data = value;
//            this.next = next;
//        }
//    }
//    Node head;
//    Node tail;
//    int size;
//
//    public int size(){
//        Node temp = head;
//        int count =0;
//        while(temp != null){
//            temp = temp.next;
//            count++;
//        }
//        System.out.println(count);
//        return count;
//    }
//
//    public int find(int value){
//        Node temp = head;
//        int index =1;
//        while(temp != null){
//            if(temp.data == value){
//                return index;
//            }
//            temp = temp.next;
//            index++;
//        }
//        return -1;
//    }
//
//    public void insertFirst(int value){
//        Node node = new Node(value);
//        node.next = head;
//        head = node;
//        if(tail ==null){
//            tail = head;
//        }
//        size++;
//    }
//
//    public void insertLast(int value){
//        Node node = new Node(value);
//        if( tail ==null){
//            insertFirst(value);
//            return;
//        }
//        tail.next = node;
//        tail = node;
//        size++;
//    }
//
//    public void insertIndex(int value, int index){
//        if(index ==0){
//            insertFirst(value);
//            return;
//        }
//        if(index == size-1){
//            insertLast(value);
//            return;
//        }
//        Node temp = head;
//        for(int i=1; i<index; i++){
//            temp = temp.next;
//        }
//        Node node = new Node(value, temp.next);
//        temp.next = node;
//        size++;
//    }
//
//    public void display(){
//        Node temp = head;
//        while(temp != null){
//            System.out.print(temp.data +"->");
//            temp = temp.next;
//        }
//        System.out.println("END!");
//
//    }
//
//    public int deleteFirst(){
//        int value = head.data;
//        head = head.next;
//        if(head == null){
//            tail = null;
//        }
//        size--;
//        return value;
//    }
//
//    public int deleteLast(){
//        if(size <=1){
//            return deleteFirst();
//        }
//        int value = tail.data;
//        Node temp = head;
//        for(int i=0; i<size-2; i++){
//            temp = temp.next;
//        }
//        tail  = temp;
//        tail.next = null;
//        return value;
//    }
//
//    public int  deleteIndex(int index){
//        if(index ==0){
//            return deleteFirst();
//        }
//        if(index == size-1){
//            return deleteLast();
//        }
//        Node prev = head;
//        for(int i=0; i<index-1; i++){
//            prev = prev.next;
//        }
//        int value = prev.next.data;
//        prev.next = prev.next.next;
//        size--;
//        return value;
//    }
//
//    public static void main(String[] args) {
//        Practise list = new Practise();
//        list.insertFirst(1);
//        list.insertFirst(2);
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.display();
//        list.insertIndex(5,2);
//        list.display();
//        list.deleteLast();
//        list.display();
//        list.deleteIndex(2);
//        list.display();
//    }
//}