package Assignment_Queue;

import java.util.NoSuchElementException;

public class Queue<T> {
		 
	    private GenericLinkedList<T> queue;
	 
	    public Queue() {
	    	queue=new GenericLinkedList<>();
	      //  queue = new GenericLinkedList<>();
	    }
	 
	    public void enqueue(T data ) {
	    	queue.addNode(new GenericNode<>());
	        //queue.addNode(new GenericNode<>(data));
	    }
	 
	    public T dequeue() {
	        if (queue.isEmpty()) {
	            throw new NoSuchElementException("Can not dequeue from an empty queue.");
	        }
	 
	        T data = queue.getList().getData();
	       // queue.setList(queue.getList().getNextNode());
	 
	        return data;
	    }
	 
	    public boolean isEmpty() {
	        return queue.isEmpty();
	    }
	 
	   

}
