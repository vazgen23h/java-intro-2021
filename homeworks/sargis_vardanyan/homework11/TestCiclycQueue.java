package homework11;

public class TestCiclycQueue {

	public static void main(String[] args) {
	
		CiclycQueue obj = new CiclycQueue(3);
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.printQueue();
		obj.remove();
		obj.add(5);
		obj.printQueue();
		
	
	}

}

class CiclycQueue {

    private int[] queue;
    private int position = -1;
    private int first = -1;
    private int size = 16;


    CiclycQueue() {
        queue = new int[size];
    }

    CiclycQueue(int size) {
        this.size = size;
        queue = new int[size];
    }

    public void add(int n) {
        if ((first == 0 && position == size - 1) || (position == first - 1)) {
            System.out.println("Queue is full: ");
            return;
        } else if (position == size - 1 && first > 0) {
            position = 0;
            queue[position] = n;
            return;
        } else if (first == -1) {
            first = 0;
            queue[first] = n;
        }
        queue[++position] = n;
    }

    public int remove() {
        if (first == -1) {
            System.out.println("Queue is empty: ");
        } else if (first == position) {
            int current = queue[first];
            first = -1;
            position = -1;
            return current;
        } else if (first > position) {
            int current = queue[first];
            first = 0;
            return current;
        }
        return queue[first++];
    }

    public void printQueue() {
        if (first == -1) {
            System.out.println("Queue is empty: ");
            return;
        } else if (first <= position) {
            for (int i = first; i <= position; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
            return;
        } else {
            for (int i = first; i < size; i++) {
                System.out.print(queue[i] + " ");
            }

            for (int i = 0; i <= position; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

}

