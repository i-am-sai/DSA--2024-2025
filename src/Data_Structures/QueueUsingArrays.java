package Data_Structures;

public class QueueUsingArrays {

    int front, rear, capacity;
    int[] queue;

    //constructor to initialize queue
    QueueUsingArrays(int c){
        front = 0;
        rear =-1;
        capacity = c;
        queue = new int[capacity];
    }

    //Function to insert
    void enqueue(int data){
        if(rear == capacity -1){
            System.out.println("Queue is Full");
            return;
        }
        queue[++rear] = data; // insert element at the rear end
    }

    //Function to delete
    void dequeue(){
        if(front > rear){
            System.out.println("Queue is empty");
            return;
        }
        for(int i=0; i<rear; i++){  // shift all elements from index 1 till rear to the left by one
            queue[i] = queue[i+1];
        }
        rear--;  //decrement rear
    }

    void display(){
        if(front > rear){
            System.out.println("Queue is empty");
        }
        for(int i= front; i<= rear; i++){        // Traverse from front to rear
            System.out.print(queue[i] + " <-- ");
        }
        System.out.println();
    }

    void front(){
        if(rear == -1){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Front element is : " + queue[front]);
    }

    public static void main(String[] args) {
        QueueUsingArrays q = new QueueUsingArrays(4);
        q.display();
        q.enqueue(8);
        q.enqueue(3);
        q.enqueue(5);
        q.front();
        q.display();
        q.dequeue();
        q.display();
    }
}
