package model;

public class Animal {
	private String name;
	private String species;
	private double foodNeeded;
	
	public Animal() {
		super();
	}

	public Animal(String name, String species) {
		super();
		this.name = name;
		this.species = species;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public double getFoodNeeded() {
		return foodNeeded;
	}

	public void setFoodNeeded(double foodNeeded) {
		this.foodNeeded = foodNeeded;
	}
}