class Thing {
	public String name;
	//  static binds to a class not a object so every static fields have each own value.
	public static String description; 
	// final == constant == cannot reassign!
	public final static int LUCKY_NUMBER = 7; 
	
	public static int count = 0;
	
	public int id;
	
	public Thing() {
		
		id = count;
		
		count++;
	}
	
	public void showName() {
		System.out.println("Object id: " + id + ", " + description + ": " + name);
	}
	
	// static method can access to static data
	public static void showInfo() {
		System.out.println(description);
	}
}

// use cases of static

public class Application {

	public static void main(String[] args) {
		
		Thing.description = "I am a thing";
		
		
		Thing.showInfo();
		
		System.out.println("Before creating objects, count is: " + Thing.count);
		

		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		System.out.println("After creating objects, count is: " + Thing.count);
		
		
		thing1.name = "Bob";
		thing2.name = "Sue";
		
		
		thing1.showName();
		thing2.showName();
		
		
		System.out.println(Math.PI);
		
		System.out.println(Thing.LUCKY_NUMBER);
		
	}

}
