import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Person {
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Id: " + id + ",Name: " + name;
	}
	
}

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		int len1 = o1.length();
		int len2 = o2.length();
		
		if(len1 > len2) {
			return 1;
		}
		else if(len1 < len2) {
			return -1;
		}
		return 0;
	}
	
}


class RevereseAlphbeticalComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return -o1.compareTo(o2);
	}
	
}

public class App {

	public static void main(String[] args) {
		
		/////////////////////// Sorting Strings ///////////////////
		List<String> animals = new ArrayList<String>();
		
		
		animals.add("tiger");
		animals.add("lion");
		animals.add("cat");
		animals.add("snake");
		animals.add("mongoose");
		animals.add("elephant");
		
		
		// Collections.sort(animals, new StringLengthComparator());
		Collections.sort(animals, new RevereseAlphbeticalComparator());
		
		for(String animal: animals) {
			System.out.println(animal);
		}
		
		
		/////////////////////// Sorting numbers ///////////////////
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(3);
		numbers.add(56);
		numbers.add(20);
		numbers.add(44);
		numbers.add(8);
		numbers.add(60);
		
		
		Collections.sort(numbers, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return -o1.compareTo(o2);
			}
		});
		
		for(Integer number: numbers) {
			System.out.println(number);
		}
		
		/////////////////////// Sorting Strings ///////////////////
		
		List<Person> people = new ArrayList<Person>();
		
		people.add(new Person(1, "Joe"));
		people.add(new Person(3, "Bob"));
		people.add(new Person(4, "Clare"));
		people.add(new Person(2, "Sue"));
		
		// Sort in order of ID
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				
				if(p1.getId() > p2.getId()) {
					return 1;
				} else if(p1.getId() < p2.getId()) {
					return -1;
				}
				
				return 0;
			}
		});
		
		for (Person person: people) {
			System.out.println(person);
		}
		
		System.out.println("\n");
		// Sort in order of Name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());
			}
		});
		
		for (Person person: people) {
			System.out.println(person);
		}
		
	}

}
