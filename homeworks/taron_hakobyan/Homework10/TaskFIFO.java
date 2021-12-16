
class FIFO {
    int queueSize = 10;
    int[] queueElements = new int[queueSize];
    int position = -1;

    void addElement(int element) {
        if (position + 1 >= queueSize) {
            System.out.println("Queue is owerflow!");
            return;
        }
        queueElements[++position] = element;
    }

    int getFrom = 0;

    void getElement() {
        System.out.println(queueElements[getFrom++]);
        --position;
    }
}

public class TaskFIFO {
    public static void main(String[] args) {
        FIFO queue = new FIFO();
        queue.addElement(12);
        queue.addElement(13);
        queue.addElement(11);
        queue.addElement(71);
        queue.addElement(26);
        queue.addElement(67);
        queue.addElement(0);
        queue.addElement(24);
        queue.addElement(101);
        queue.addElement(32);
        queue.getElement();
        queue.addElement(11111);
    }
}