
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UrlLibrary urllibrary = new UrlLibrary();
		
		for(String html: urllibrary) {
			System.out.println(html.length());
//			System.out.println(html);
		}
	}

}
