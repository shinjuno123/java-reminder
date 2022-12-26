class Machine {
	private String name;
	private int code;

	public Machine() {
		this("Arnie", 0);
		System.out.println("Constructor running!");
		
//		name = "Arnie";
		
	}

	public Machine(String name) {
		this(name, 0);
		
		System.out.println("Second constructor running");
		this.name = name;
		
	}

	public Machine(String name, int code) {
		
		System.out.println("Third constructor running");
		this.name = name;
		this.code = code;
	}
}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine machine1 = new Machine();

		Machine machine2 = new Machine("Berties");
		
		Machine machine3 = new Machine("Chalky", 7);

	}

}
