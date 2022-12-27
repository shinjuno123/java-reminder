
public class Robot {
	private int id;
	
	private class Brain {
		public void think() {
			System.out.println("Robot " + id + " is thinking.");
		}
	}

	public Robot(int id) {
		this.id = id;
	}
	
	public void start() {
		System.out.println("Starting robot " + id);
		
		Brain brain = new Brain();
		brain.think();
	}
}
