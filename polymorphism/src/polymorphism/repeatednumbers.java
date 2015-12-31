package polymorphism;

import java.util.Arrays;

public class repeatednumbers {

	public static void main(String[] args) {
		int[] numbers = { 1, 5, 23, 2, 1, 6, 3, 1, 8, 12, 3 };
		Arrays.sort(numbers);

		for(int i = 1; i < numbers.length; i++) {
		    if(numbers[i] == numbers[i - 1]) {
		        System.out.println("Duplicate: " + numbers[i]);
		    }
		}

	}

}
