public class Queue {

    //Front pointing (front)
    private Node front;

    //End pointing (rear)
    private Node rear;

    private class Node {

        //Data node
        int data;
        //Reference node
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Queue() {
        front = null;
        rear = null;
    }

    public void enqueue(int item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue element.");
            //Return a default value for empty queue
            return -1;
        }

        Node dequeuedNode = front;
        front = front.next;
        dequeuedNode.next = null;

        if (front == null) {
            //If Dequeue performed on the last element then updating rear to null
            rear = null;
        }

        return dequeuedNode.data;
    }

    public boolean isEmpty() {
        return (front == null);
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        //Performing insertion (Enqueue)
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        //Performing deletion (Dequeue)
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());

        //Checking if Queue isEmpty or not: We know 1 element is there in Queue
        System.out.println("Is queue empty? : " + queue.isEmpty());
    }
}
