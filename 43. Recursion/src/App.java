
public class App {

	public static void main(String[] args) {
		// E.g. 4!
		System.out.println(factorial(3));
		hanoi(3, "A", "B", "C");

	}

	private static void hanoi(int disk, String start, String inter, String end) {
		if (disk == 0) {
			return;
		} else {
			hanoi(disk - 1, start, end, inter);
			System.out.printf("Move %s to %s\n", start, end);
			hanoi(disk - 1, inter, start, end);
		}
	}

	private static int factorial(int value) {

		if (value == 1 || value == 0) {
			return 1;
		}

		return factorial(value - 1) * value;
	}

}
