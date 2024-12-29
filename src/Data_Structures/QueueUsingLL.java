package Data_Structures;

class Queue {
    Node front, rear;

    Queue() {
        front = rear = null;  // constructor to initialize front and rear
    }

    boolean isEmpty() {
        return front == null && rear == null;
    }

    void enqueue(int new_data) {
        Node new_node = new Node(new_data);
        if (rear == null) {
            front = rear = new_node;  // If queue node is empty, the new node is both the front and the rear.
            return;
        }
        rear.next = new_node;  // change rear
        rear = new_node;
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return;
        }

        Node temp = front; // Store previous and move front one to left.
        front = front.next;
        if (front == null) {   // If front becomes to null, then change rear also to null
            rear = null;
        }
    }

    int getFront() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return Integer.MIN_VALUE;
        }
        return front.data;
    }

    int getRear() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return Integer.MIN_VALUE;
        }
        return rear.data;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }

        Node temp = front;
        System.out.print("FRONT <- ");
        while (temp != null) {
            System.out.print(temp.data + " <- ");
            temp = temp.next;
        }
        System.out.println("REAR");
    }
}

    public class QueueUsingLL {
        public static void main(String[] args) {
            Queue queue = new Queue();
            queue.enqueue(4);
            queue.enqueue(3);
            queue.enqueue(8);
            queue.display();

            System.out.println(queue.getFront());
            System.out.println(queue.getRear());
            queue.dequeue();
            queue.display();
        }
    }
