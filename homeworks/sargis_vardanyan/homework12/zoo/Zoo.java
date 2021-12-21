package zoo;

import java.util.Arrays;

class Zoo {
	
	private Animal[] animals;
	private int countOfAnimals = 0;
	private int last = -1;
	
	Zoo(int capacity) {
		animals = new Animal[capacity];;
	}
	
	public void add(Animal animal) {
		if (countOfAnimals == animals.length - 1) {
			ensureCapacity();
		}
		animals[++last] = animal;
		countOfAnimals++;
	}
	
	public Animal remove() {
		if (countOfAnimals == 0) {
			System.out.println("Zoo is empty: ");
			return null;
		}
		Animal temp = animals[last];
		animals[last--] = null;
		countOfAnimals--;
		return temp;
	}
	
	public void print() {
		System.out.printf("%6s%20s%6s", "type", "characteristic", "food");
		System.out.println();
		for (int i = 0; i < countOfAnimals; i++) {
			if (animals[i] == null) {
				System.out.print((i + 1) + ". Empty cage ");
			} else if (animals[i].ifPredator() == true) {
				System.out.printf("%d%s%-10s%-16s%s", i + 1, ".", animals[i].getType(), "predator", animals[i].getFood());	
			} else {
				System.out.printf("%d%s%-10s%-16s%s", i + 1, ".", animals[i].getType(), "herbivore", animals[i].getFood());
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void ensureCapacity() {
		animals = Arrays.copyOf(animals, 2 * animals.length);
	}

}

