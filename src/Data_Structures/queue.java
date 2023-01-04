package Data_Structures;

public class queue {

    public static void main(String[] args) {
        // Create an object of queue class
        queue q = new queue(4);

        // print Queue elements
        queueDisplay();

        // inserting elements in the queue
        queueEnqueue(1);
        queueEnqueue(2);
        queueEnqueue(3);
        queueEnqueue(4);
        queueDisplay();
        queueDequeue();
        queueDisplay();


    }

    // First we need variables for the queues
    private static int front, back, capacity;
    private static int[] queue;

    // Next we need the methods for the queue

    // Constructor
    public queue(int c) {
        front = back = 0;
        capacity = c;
        queue = new int[capacity];
    }

    // method to insert an element at the back of the queue
    public static void queueEnqueue(int data) {
        // check if the queue is full
        if (capacity == back) {
            System.out.println("Queue is full");
        } else {
            queue[back] = data;
            back++;
        }
    }

    // method to remove an element from the front of the queue
    public static void queueDequeue() {
        // check if the queue is empty
        if (front == back) {
            System.out.println("Queue is empty");
        } else {
            for (int i = 0; i < back - 1; i++) {
                queue[i] = queue[i + 1];
            }
            // decrement back by one
            back--;
        }
    }

    // method to print the elements of the queue
    public static void queueDisplay() {
        int i;
        if (front == back) {
            System.out.println("Queue is empty");
        }
        // traverse front to back and print elements
        for (i = front; i < back; i++) {
            System.out.println(" " + queue[i]);
        }
    }



}
