
class Temp implements AutoCloseable {

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Closing!");
		throw new Exception("oh no!");
	}

}

public class App {

	public static void main(String[] args) {
		try(Temp temp = new Temp()){
			
		} catch (Exception e) {
			e.printStackTrace();
		};
		
		
	}

}
