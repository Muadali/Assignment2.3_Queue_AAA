package Assignment_Queue;

public class Queue<T> extends GenericLinkedList<T>{
	 
    //private GenericLinkedList<T> queue;
 
    public Queue() {
    	super();
      //  queue = new GenericLinkedList<>();
    }
 
    public void enqueue(GenericNode<T> node ) {
    	super.addNode(node);
        //queue.addNode(new GenericNode<>(data));
    }

    public GenericNode <T> dequeue ( ) {
    	if (this.isEmpty ( ) ){
		return null ;
		}
	
    	GenericNode < T > front = head ;
    	head=head.getNextNode ( ) ;
    	this.length-- ;
    	return front ;
    } // end dequeue


}//end class
