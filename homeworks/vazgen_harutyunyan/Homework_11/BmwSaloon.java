public class BmwSaloon {
    Bmw[] cars=new Bmw[10];
    static int sold=0;
    int position;

    void addCar(Bmw bmw) {
    	cars[position]=bmw;
    	position++;
    }

    Bmw sellCar() {
    	position--;
    	return cars[position];
    }

    static int soldCars() {
    	sold++;
    	return sold;
    }

    void listCars(){
    	for(Bmw a: cars){
    		System.out.println(a);
    	}
    }

}
