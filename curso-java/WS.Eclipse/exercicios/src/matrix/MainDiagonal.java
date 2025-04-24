package matrix;

import java.util.Scanner;

public class MainDiagonal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int count = 0;

		int[][] mat = new int[n][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
				if (mat[i][j] < 0) {
					count++;

				}

			}

		}
		System.out.println("Main diagonal:");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		/*int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;

				}
			}
	}
		*/
		System.out.println();
		System.out.printf("Negative Numbers = " + count);

	}

}
