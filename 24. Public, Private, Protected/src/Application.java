import world.Plant;

/*
 * private -- only within same class
 * public -- from anywhere.
 * protected -- same class, subclass or same package
 * no modifier -- same package only
 */


public class Application {

	public static void main(String[] args) {
		Plant plant = new Plant();
		
		System.out.println(plant.name);
		
		System.out.println(Plant.ID);
		
		// Won't work --- type is private.
		// System.out.println(plant.type);
		
		// size is protected
		// Application is not in the same package as Plant.
		// Won't work
		// System.out.println(plant.size);
		
		
		// Won't work
		// Application and Plant in different packages, height has package-level visibility
		// System.out.println(plant.height);
	}

}
