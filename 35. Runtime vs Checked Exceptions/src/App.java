
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] text = {"one","two","three"};
		
		
		try {
			System.out.println(text[3]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
