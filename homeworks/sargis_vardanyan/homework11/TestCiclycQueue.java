package homework11;

public class TestCiclycQueue {
	
	public static void main(String[] args) {
		
		CiclycQueue queue1 = new CiclycQueue(5);
		for(int i = 0; i < queue1.queue.length; i++) {
			queue1.add(i);
		}
		queue1.printQueue();
		
		
	}

}

class CiclycQueue {

    int[] queue;
    int defaultCapacity = 16;
    int front = -1;
    int position = -1;

    CiclycQueue() {
        queue = new int[defaultCapacity];
    }

    CiclycQueue(int length) {
        queue = new int[length];
    }

    //(position == queue.length - 1 && front == 0) || position == queue.length - 1
    void add(int n) {
        if ((position == queue.length - 1 && front == -1)) {
            System.out.println("Queue is full: ");
        } else {
            if (position == queue.length - 1 && front > 0) {
                position = -1;
            }
            queue[++position] = n;
        }

    }

    int remove() {
        if(position == -1) {
            System.out.println("Queue is empty;");
            return 0;
        } else if ((front == queue.length - 1) && position < queue.length -1) {
            front = 0;
            return queue[front];
        }
        return queue[++front];

    }

    void printQueue() {
        if (position == -1) {
            System.out.println("Queue is empty");
            return;
        }
        if (position > front) {
            for (int i = front + 1; i <= position; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        } else if (front < queue.length - 1 && front > position) {
            for (int i = front + 1; i < queue.length; i++) {
                System.out.print(queue[i] + " ");
            }

            for (int i = 0; i <= position; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        } else if (front == queue.length - 1) {
            for (int i = 0; i <= position; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        } 

    }

}
