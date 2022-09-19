package Assignment_Queue;

public class Application {
	
	public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue("Alice");
        queue.enqueue("Bob");
        queue.enqueue("Jane");
        queue.enqueue("Hamad");
        queue.enqueue("Jim");
 
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }

}
