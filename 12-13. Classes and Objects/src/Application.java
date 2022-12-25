class Person {

	// Instance variables (data or "state")
	String name;
	int age;

	// Classes can contain

	// 1. Data
	// 2. Subroutines (methods)

	void speak() {
		for (int i = 0; i < 3; i++) {
			System.out.println("My name is " + this.name + "and I am " + this.age + " years old.");
		}

	}
	
	void sayHello() {
		System.out.println("Hello there!");
	}
}

public class Application {

	public static void main(String[] args) {
		Person person1 = new Person();

		person1.name = "Joe Bloggs";
		person1.age = 37;
		person1.speak();
		person1.sayHello();

		Person person2 = new Person();

		person2.name = "Junho Shin";
		person2.age = 24;
		person2.speak();
		person2.sayHello();

		System.out.println(person1.name + " " + person2.name);

	}

}
