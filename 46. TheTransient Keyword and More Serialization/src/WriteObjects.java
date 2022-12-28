import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {
	public static void main(String[] args) {
		System.out.println("Writing Objects...");
		
		// This syntax calls close method automatically!
		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("people.data"));){
			
			
			Person person = new Person(7, "Bob");
			Person.setCount(88);
			os.writeObject(person);
			
	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
