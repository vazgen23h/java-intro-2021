public class QueueTest {
    public static void main(String[] args) {
        Queue obj = new Queue();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
        obj.print();
        obj.remove();
        obj.print();
        obj.add(1000);
        obj.print();


    }
}


class Queue {
    int[] array = new int[5];
    int position = -1;
    int firstIndex = -1;


    void add(int a) {
        if(position == array.length - 1 && firstIndex == -1) {
            System.out.println("Your Queue is full");
        } else {
            if(position == array.length - 1 && firstIndex >= 0) {
                position = -1;
            }
            array[++position] = a;
        }
    }


    int remove() {
        if(position == -1) {
            System.out.println("Queue is empty");
            return 0;
        } else if((firstIndex == array.length - 1) && (position < array.length - 1)) {

            firstIndex = 0;
            return array[++firstIndex];
        }

        return array[++firstIndex];

    }

    void print() {
        if(position == -1) {
            System.out.println("Empty queue");
            return;
        }
        if(position > firstIndex) {
            for(int i = firstIndex + 1; i <= position; i++) {
                System.out.print(array[i] + " ");

            }
            System.out.println();
        } else if(firstIndex > position && firstIndex < array.length - 1) {
            for(int i = firstIndex + 1; i < array.length; i++) {
                System.out.print(array[i]);
            }
            for(int i = 0; i <= position; i++) {
                System.out.print(array[i]);
            }
            System.out.println();
        } else if(position == firstIndex) {
            System.out.print("Queue Empty");
            System.out.println();
        } else if(firstIndex == array.length - 1) {
            for(int i = 0; i <= position; i++) {
                System.out.print(array[i]);
            }
            System.out.println();
        }
    }
}

















