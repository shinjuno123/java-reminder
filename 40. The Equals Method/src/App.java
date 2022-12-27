import java.util.Objects;

class Person {
	private int id;
	private String name;
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	
	
	
}

public class App {

	public static void main(String[] args) {

		System.out.println(new Object());
		
		Person person1 = new Person(5,"Bob");
		Person person2 = new Person(5,"Bob");
		
		
		System.out.println(person1.equals(person2));
		
		Double value1 = 7.2;
		Double value2 = 7.2;
		
		System.out.println(value1.equals(value2));
		
		Integer number1 = 6;
		Integer number2 = 6;
		
		System.out.println(number1.equals(number2));
		
		String text1 = "Hello";
		String text2 = "Hellofawd".substring(0,5);
		System.out.println(text2);
		
		System.out.println(text1.equals(text2));
	}

}
