
import java.util.*;

public class framework {

    static int[] queue;
    static int front = -1;
    static int rear = -1;

    // Add element
    static void enqueue(int value) {

        if (rear == queue.length - 1) {
            System.out.println("Queue is Full");
        } else {
            if (front == -1) {
                front = 0;
            }

            rear++;
            queue[rear] = value;

            System.out.println(value + " inserted");
        }
    }

    // Remove element
    static void dequeue() {

        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println(queue[front] + " removed");
            front++;
        }
    }

    // Display queue
    static void display() {

        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.print("Queue: ");

            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter queue size: ");
        int size = sc.nextInt();

        queue = new int[size];

        enqueue(10);
        enqueue(20);
        enqueue(30);

        display();

        dequeue();

        display();

        enqueue(40);

        display();

        sc.close();
    }
}
