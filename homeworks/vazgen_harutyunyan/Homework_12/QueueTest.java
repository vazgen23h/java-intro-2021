public class QueueTest{
	public static void main(String[] args){
		Queue obj=new Queue();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.print();
		//System.out.print(obj.remove());
		obj.remove();
		obj.add(99);
		obj.print();

		
	}
}





class Queue{
private int position=-1;
private int firsElement=-1;
private int[] array=new int[3];


public void add(int number){
	if(position!=-1 && position==firsElement){
		System.out.println("Queue is full");
		return;
	}
	if(position==array.length-1){
		if(firsElement==-1){
			System.out.println("Your queue is full");
			return;
		}else if(firsElement>=0){
			position =-1;
		}
	} 
	
	array[++position]=number;
}

public int remove(){
	if(position==-1){
		System.out.println("Your queue is empty");
		return 666;
	}
	if(firsElement==array.length-1 && position>=0){
		firsElement=-1;
	}
	return array[++firsElement];
}

public void print(){
	if(position==-1 && firsElement==-1){
		System.out.println("EMPTY");
		return;
	}else if(position>firsElement){
		for(int i=firsElement+1;i<=position;i++){
			System.out.println(array[i]);
			return;
		}
		System.out.println("------------");
	}else if(firsElement>position){
		for(int i=firsElement;i<array.length;i++){
			System.out.println(array[i]);
		}
		for(int i=0;i<=position;i++){
			System.out.println(array[i]);
		}
	}
}

}
