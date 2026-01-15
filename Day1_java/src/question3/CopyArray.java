package question3;

import java.util.Scanner;

public class CopyArray {
	public static int[] copyOf(int[] arr) {
		int n = arr.length;
		int copy[] = new int[n];
		for (int i = 0; i < n; i++) {
			copy[i] += arr[i];
		}
		for (int i = 0; i < n; i++) {
			copy[i] += 5;
		}
		return copy;

	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n;
			System.out.println("Enter the size of the array: ");
			n = sc.nextInt();
			if (n == 0) {
				System.out.println("The array is empty!!");
			}
			int arr[] = new int[n];
			System.out.println("Enter the elements of the array: ");
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			// before passing the original array
			System.out.println("The elements of the original array: ");
			for (int i = 0; i < n; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			int copy[] = new int[n];
			copy = copyOf(arr);
			System.out.println("The elements after the copy method: ");
			for (int i = 0; i < n; i++) {
				System.out.print(copy[i] + " ");
			}

		}
		catch(Exception e) {
			System.out.println("The program ran into some issues!!");
		}
	}

}