public class ZooDemo{
	public static void main(String[] args){
		Zoo obj=new Zoo();
		Bird b=new Bird();
		b.setType("ASDF");
		b.setLegs(123);
		Fish f=new Fish();
		obj.addBirds(b);

		f.setType("GHJK");
		f.setColour("Dexin");
		obj.addFishes(f);
		obj.printZoo();
		

	}
}