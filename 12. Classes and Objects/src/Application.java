class Person {
	
	// Instance variables (data or "state")
	String name;
	int age;
	
	Person(){
		System.out.println("Object Created");
	}
	
	// Classes can contain

	// 1. Data
	// 2. Subroutines (methods)
}

public class Application {

	public static void main(String[] args) {		
		Person person1 = new Person();
		
		person1.name = "Joe Bloggs";
		person1.age = 37;
		
		Person person2 = new Person();
		
		person2.name = "Junho Shin";
		person2.age = 24;
		
		System.out.println(person1.name + " " + person2.name);
	}

}
