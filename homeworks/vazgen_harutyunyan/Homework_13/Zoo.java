
public class Zoo {

    private Bird[] birds = new Bird[3];
    private int birdsCount = 0;
    private Fish[] fishes = new Fish[3];
    private int fishesCount = 0;

    public void addBirds(Bird b) {
        birds[birdsCount] = b;
        birdsCount++;
    }


    public void addFishes(Fish f) {
        fishes[fishesCount] = f;
        fishesCount++;
    }

    public void printZoo() {
        for(int i = 0; i < fishesCount; i++) {
            System.out.printf("Type is: %s | The legs count: %d \n", birds[i].getType(), birds[i].getLegs());
        }
        for(int i = 0; i < birdsCount; i++) {
        	System.out.printf("Type is: %s | The colour is: %s \n", fishes[i].getType(), fishes[i].getColour());
        }
    }

}