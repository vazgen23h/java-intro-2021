package bmw;

public class Main {

	public static void main(String[] args) {
		
		BmwSaloon saloon = new BmwSaloon();
		Bmw car1 = new Bmw("series6", "black", "petrol");	
		
		saloon.addCar(car1);
		saloon.listCars();
		
	}

}
