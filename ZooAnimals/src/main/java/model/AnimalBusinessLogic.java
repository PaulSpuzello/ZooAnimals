package model;

public class AnimalBusinessLogic {
	public String nameOfAnimal(Animal animal) {
		String name = "";
		
		name = animal.getName();
		return name;
	}
	
	public String nameOfSpecies(Animal animal) {
		String species = "";
		
		species = animal.getSpecies();
		return species;
	}
	
	public boolean lbsOfFood(Animal animal)  {
		double lbsNeeded = 0.0;
		boolean needsMet = false;
		
		if (animal.getSpecies() == "Penguin") {
			lbsNeeded = 5.0;
			needsMet = true;
		} else if (animal.getSpecies() == "Polar Bear") {
			lbsNeeded = 4.4;
			needsMet = true;
		} else if (animal.getSpecies() == "Zebra") {
			lbsNeeded = 3.0;
			needsMet = true;
		}
		
		return needsMet;
	}
}
