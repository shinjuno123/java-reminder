
public class Application {
	public static void main(String[] args) {

		int loop = 0;
		
		while (true) {
			System.out.println("looping: " + loop);
			
			if(loop == 5) {
				break;
			}
			
			loop++;
			
			System.out.println("Running");
		}

		

	}
}
