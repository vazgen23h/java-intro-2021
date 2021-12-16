package bmw;

class BmwSaloon {

	Bmw[] exsistingCars;
	static int sallonCapacity = 16; 
	static int soldCars;
	static int producedCars;
	int lastCarIndex = -1;
	
	
	BmwSaloon() {
		exsistingCars = new Bmw[sallonCapacity];
	}
	
	BmwSaloon(Bmw ... bmws) {
		this();
		for (int i = 0; i < bmws.length; i++) {
			exsistingCars[i] = bmws[i];
			lastCarIndex++;
			producedCars++;
		}
	}
	
	void addCar(Bmw bmw) {
		if (lastCarIndex < exsistingCars.length - 1) {
			exsistingCars[++lastCarIndex] = bmw;
			producedCars++;
			return;
		}
		System.out.println("No space in saloon: ");
	}
	
	Bmw sellCar() {
		if (lastCarIndex == -1) {
			System.out.println("No exsisting car in saloon: ");
			return null;
		}
			
		soldCars++;	
		return exsistingCars[lastCarIndex--];
	}
	
	static int soldCars() {
		return soldCars;
	}
	
	static int producedCars() {
		return producedCars;
	}
	
	void listCars() {
		for (int i = 0; i < lastCarIndex + 1; i ++) {
			System.out.print(exsistingCars[i].model + ", ");
		}
		System.out.println();
	}
	
	
	

}
