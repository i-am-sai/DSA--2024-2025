import Data_Structures.DoublyLL;

import java.time.temporal.Temporal;

public class Practise {

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    Node head;
    Node tail;
    int size;

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        if (head == null) {
            head.prev = node;
            head = node;
        }
       Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        size++;
    }

    public void insertIndex(int index, int value){
        Node indexElement = head;
        while(indexElement != null){
            if(indexElement.data == index){
                return;
            }
            indexElement = indexElement.next;
        }
        if( indexElement == null){
            System.out.println("Does not exist");
        }
        Node node = new Node(value);
        node.next = indexElement.next;
        indexElement.next = node;
        node.prev = indexElement;
        if(node.next != null){
            node.next.prev = node;
        }


    }


    public static void main(String[] args) {
        Practise list = new Practise();

        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.display();
        list.insertLast(6);
        list.display();
        list.insertIndex(1,7);

    }
}