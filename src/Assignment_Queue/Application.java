package Assignment_Queue;

public class Application {
	
	
	public static void main(String [] args) {
		
	
		//customers
		
		Queue<String> queue= new Queue<String>();
		//System.out.printf("There are %d items in the queue. \n", queue.getLength());
		
		GenericNode<String> customer1= new GenericNode<String>();
		customer1.setData("Bill");
		
		GenericNode <String> customer2 = new GenericNode <String> ( );
		customer2.setData ( "Alice");
		
		GenericNode <String> customer3 = new GenericNode <String> ( );
		customer3.setData ( "Bob");
		
		GenericNode <String> customer4 = new GenericNode <String> ( );
		customer4.setData ( "Jane");
		
		GenericNode <String> customer5 = new GenericNode <String> ( );
		customer5.setData ( "Hamad");
	
		GenericNode <String> customer6 = new GenericNode <String> ( );
		customer6.setData ("Jim");
		
		
		queue.enqueue ( customer1 );
		queue.enqueue ( customer2 );
		queue.enqueue ( customer3 );
		
		
		printQueue (queue);
		
		
		System.out.println ( " A customer is served " );
		queue.dequeue ( ) ;
		printQueue (queue );
		
		
		System.out.println ( " A customer arrives " );
		queue.enqueue ( customer4 ) ;
		printQueue ( queue );
		
		
		System.out.println ( " A customer arrives " );
		queue.enqueue ( customer5 );
		printQueue ( queue );
		
		
		System.out.println ( " A customer arrives " );
		queue.dequeue ();
		System.out.println ( " A customer arrives " );
		queue.dequeue ();
		printQueue(queue);
		
		System.out.println ( " A customer arrives " );
		queue.enqueue ( customer6 );
		printQueue ( queue );
		
		System.out.println ( " A customer arrives " );
		queue.dequeue ();
		System.out.println ( " A customer arrives " );
		queue.dequeue ();
		printQueue(queue);
	
	}//end main     
	

}//end class
