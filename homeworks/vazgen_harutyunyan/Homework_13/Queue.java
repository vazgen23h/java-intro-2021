public class Queue {
    private int[] array;
    private int position=0;
    private int count=0;
    private int front=0;


    public Queue(int size){
        array=new int[size];
    }


    public void add(int a){
        if(count==array.length){
            System.out.println("queue is full");
        }
        if(count<array.length){
            count++;
            array[position++ % array.length]=a;
        }
    }


    public int remove(){
        if(count==0){
            System.out.println("Exception, Queue is empty");
            return 666;
        }else{
            int removedElement=array[front++ % array.length];
            count--;
            return removedElement;
        }
    }


    public void print(){
        for(int i=0;i<count;i++){
            System.out.print(array[(i+front%array.length)%array.length]+" ");
        }
    }
}
