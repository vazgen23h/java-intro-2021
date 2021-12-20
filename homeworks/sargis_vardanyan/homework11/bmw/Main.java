package bmw;

public class Main {

	public static void main(String[] args) {
		
		BmwSaloon saloon = new BmwSaloon();
		Bmw car1 = new Bmw("series5", "black", "petrol");
		Bmw car2 = new Bmw("series6", "white", "petrol");
		Bmw car3 = new Bmw("series7", "green", "petrol");	
		Bmw[] bmws = {car1, car2, car3};
		BmwSaloon newSaloon = new BmwSaloon(bmws);
		
		newSaloon.listCars();
		
	}

}
