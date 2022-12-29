import java.util.Iterator;
import java.util.LinkedList;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> animals = new LinkedList<String>();
		
		animals.add("fox");
		animals.add("cat");
		animals.add("dog");
		animals.add("rabbit");
		
		Iterator<String> it =  animals.iterator();
		while(it.hasNext()) {
			String animal = it.next();
			System.out.println(animal);
			
			
			if(animal.equals("cat")) {
				it.remove();
			}
		}

		System.out.println();
		
		/// Modern iteration, Java 5 and later
		
		for(String ani: animals) {
			System.out.println(ani);
			
		}
	}

}
