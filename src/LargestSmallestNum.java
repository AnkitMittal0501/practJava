import java.util.Arrays;

public class LargestSmallestNum {

	public static void main(String args[]) {
		int number[] = { -25, 22, 65, -90, 6546513 };
		int min = number[0];
		int large = number[0];
		for (int i = 1; i < number.length; i++) {
			if (number[i] > large) {
				large = number[i];
			} else if (number[i] < min) {
				min = number[i];
			}
			

		}
		System.out.println("Given array "+Arrays.toString(number));
		System.out.println(large);
		System.out.println(min);
	}
}
