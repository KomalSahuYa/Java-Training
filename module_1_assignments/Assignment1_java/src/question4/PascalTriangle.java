package question4;

import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the size of the array");
			int n = sc.nextInt();
			int pas[][] = new int[n][];
			pas[0] = new int[1];
			pas[0][0] = 1;
			for (int i = 0; i < n; i++) {
				pas[i] = new int[i + 1];
				pas[i][0] = 1;
				pas[i][i] = 1;
				for (int j = 1; j < i; j++) {
					pas[i][j] = pas[i - 1][j - 1] + pas[i - 1][j];
				}
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < pas[i].length; j++) {
					System.out.print(pas[i][j] + " ");
				}
				System.out.println();

			}
			//check
			//check
			//check check

		}
	}
}
