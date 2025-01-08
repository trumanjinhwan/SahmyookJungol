package q506;

public class Main {

	public static void main(String[] args) {
		Object[] arr = { "My height", 170, "My weight", 68.600000 };

		for (Object i : arr) {
			if (i instanceof String) {
				System.out.printf("%s\n", i);
			} else if (i instanceof Integer) {
				System.out.printf("%d\n", i);
			} else if (i instanceof Double) {
				System.out.printf("%.6f", i);
			} else {
				System.out.println("올바른 값이 아닙니다.");
			}
		}

	}

}
