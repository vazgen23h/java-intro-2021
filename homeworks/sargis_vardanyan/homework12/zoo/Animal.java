package zoo;

class Animal {
	
	private String type;
	private String food; 
	private boolean ifPredator = false;
	private boolean ifHerbivores = false;
	
	Animal(String type, String food, boolean predOrHerb) {
		this.type = type;
		this.food = food;
		if (predOrHerb == true) {
			ifPredator = true;
		} else {
			ifHerbivores = true;
		}
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String food) {
		this.type = type;
	}
	
	public String getFood() {
		return food;
	}
	
	public void setFood(String food) {
		this.food = food;
	}
	
	public boolean ifPredator() {
		return ifPredator;
	}
	
	public void setPredator(boolean b) {
		ifPredator = b;
	}
	
	public boolean ifHerbivores() {
		return ifHerbivores;
	}
	
	public void setHerbivores(boolean b) {
		ifHerbivores = b;
	}
}
