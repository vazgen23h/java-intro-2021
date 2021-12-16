package homework10;

public class TestQueue {

	public static void main(String[] args) {
		
		Queue queue = new Queue();
		for (int i = 0; i < 5; i++) {
			queue.offer((char)(100 + i));
		}
		System.out.println("queue last element: " + queue.element());
		System.out.println("if there is empy space in queue: " + queue.offer('p'));				
		System.out.println("queue last element: " + queue.peek());
		System.out.println("queue last element: " + queue.pull());
		System.out.println("queue last element: " + queue.pull());
		
	}

}

class Queue {
	
	int defaultCapacity = 16;
	char[] queueElements;
	int head = -1;
	
	Queue() {
		queueElements = new char[defaultCapacity];
	}	
	
	
	/* Retrieves, but does not remove, the head of this queue.*/
	char element() {
		return queueElements[0];
	}
	
	/* Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
	*/
	boolean offer(char ch) {
		if (head < queueElements.length - 1) {
			queueElements[++head] = ch;
			return true;
		}
		return false;
	}
	
	/*Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.*/
	char peek() { 
		if (head > -1) {
			return queueElements[0];
		}
		return 0;
	}
	
	/*Retrieves and removes the head of this queue, or returns null if this queue is empty.*/
	char pull() {
		char first = 0;
		
		if (head > -1) {
			first = queueElements[0];
			System.arraycopy(queueElements, 1, queueElements, 0, queueElements.length -1); 
		}
		return first;
	}
	
	
}




