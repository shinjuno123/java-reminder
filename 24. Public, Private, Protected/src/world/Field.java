package world;

public class Field {
	Plant plant = new Plant();
	
	public Field() {
		
		// size is protected and field is in the same package as plant
		System.out.println(plant.size);
	}
}
