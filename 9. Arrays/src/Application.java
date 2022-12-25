import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		int value = 7;

		int[] values; // reference type
		values = new int[3];

		System.out.println(values[0]);

		values[0] = 10;
		values[1] = 40;
		values[2] = 20;

		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);

		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		
		int[] numbers = {5, 6, 7};
		
		for (int i=0; i < numbers.length;i++) {
			System.out.println(numbers[i]);
		}
	}

}
