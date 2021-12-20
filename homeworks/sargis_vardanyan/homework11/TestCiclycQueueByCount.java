package homework11;

public class TestCiclycQueueByCount {

	public static void main(String[] args) {
		
		CiclycQueueByCount obj = new CiclycQueueByCount(3);
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.print();
		obj.remove();
		obj.print();
		obj.add(4);
		obj.print();
		
	}

}

class CiclycQueueByCount {

    private int[] queue;
    private int count;
    private int first;
    private int position;

    CiclycQueueByCount() {
        this.count = 0;
        this.first = -1;
        this.position = -1;
        queue = new int[16];
    }

    CiclycQueueByCount(int size) {
        this();
        queue = new int[size];
    }

    public void add(int n) {
        if (count == queue.length) {
            System.out.println("Queue is full: ");
            return;
        } else if (first == -1) {
            queue[++first] = n;
            position++;
            count++;
            return;
        }
        queue[(++position % (queue.length))] = n;
        count++;
    }

    public int remove() {
        if (count == 0) {
            System.out.println("Queue is empty: ");
            return 0;
        }
        count--;
        return queue[(first++ % (queue.length - 1))];
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(queue[(i + (first % (queue.length))) % queue.length] + " ");
        }
        System.out.println();
    }
    
}
