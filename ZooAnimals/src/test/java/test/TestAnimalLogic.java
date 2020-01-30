package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Animal;
import model.AnimalBusinessLogic;

public class TestAnimalLogic {
	AnimalBusinessLogic animBL = new AnimalBusinessLogic();
	Animal penguin = new Animal("Jasper", "Penguin");
	Animal polarBear = new Animal("Mr. Fluff", "Polar Bear");
	Animal zebra = new Animal("Stripes", "Zebra");
			
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testNameIsNotNull() {
		String name = animBL.nameOfSpecies(penguin);
		
		assertNotNull(name);
	}
	
	@Test
	public void testSpecies() {
		String species = animBL.nameOfSpecies(zebra);
				
		assertEquals("Zebra", species);
	}
	
	@Test
	public void testLbsOfFood() {
		boolean lbsFoodPolarBear = animBL.lbsOfFood(polarBear);
		assertTrue(lbsFoodPolarBear);
	} 
}
