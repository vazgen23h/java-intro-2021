class Queue {
    int[] array = new int[10];
    int position = 0;
    int firstIndex = 0;
    int firstElement;


    void push(int a) {
        if(position < array.length) {
            array[position++] = a;
        } else {
            System.out.println("Your queue has already full");
        }
    }


    int pop() {
        if(firstIndex < position) {
            firstElement = array[firstIndex++];
            return firstElement;
        } else {
            System.out.println("Empty");
            return -1;
        }
    }


    void queuePrint() {
        for(int i = firstIndex; i < position; i++) {
            System.out.println(array[i]);
        }
    }
}


public class QueueTest {
    public static void main(String[] args) {

        Queue obj = new Queue();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.pop();
        obj.pop();
        System.out.println(obj.pop());

        obj.queuePrint();

    }
}