package zoo;

public class TestZoo {

	public static void main(String[] args) {
	
		Zoo zoo = new Zoo(7);
		Animal lion = new Animal("Lion", "meat", true);
		Animal tiger = new Animal("Tiger", "meat", true);
		Animal leopard = new Animal("Leopard", "meat", true);
		Animal zebra = new Animal("Zebra", "plants", false);
		Animal dear = new Animal("Dear", "plants", false);
		
		zoo.add(lion);
		zoo.add(tiger);
		zoo.add(leopard);
		zoo.add(zebra);
		zoo.add(dear);
		zoo.print();
		
		zoo.remove();
		zoo.remove();
		zoo.remove();
		zoo.print();
		
	}

}
