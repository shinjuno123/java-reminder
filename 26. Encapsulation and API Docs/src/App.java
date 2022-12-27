// Encapsulation
// 1. By encapsulation, We can hide implementation details within our class
// and just provide public API programming interface.
// 2. Prevent classes being tightly tangled, coupled.

class Plant {
	
	public static final int ID = 7;
	private String name;
	
	public String getData() {
		String data = "some stuff" + calculateGrowthForcast();
		
		return data;
	}
	
	private int calculateGrowthForcast() {
		return 9;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}


public class App {

	public static void main(String[] args) {
		
	}

}
