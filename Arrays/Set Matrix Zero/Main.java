/******************************************************************************

Set Matrix Zero

Problem Statement: Given a matrix if an element in the matrix is 0
then you will have to set its entire column and row to 0 and then return the matrix.
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {

		ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
		matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
		matrix.add(new ArrayList<>(Arrays.asList(4, 0, 6)));
		matrix.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

		int n = 3, m = 3;

		ArrayList<ArrayList<Integer>> result = zeroMatrix(matrix, n, m);

		for (ArrayList<Integer> row : result) {
			System.out.println(row);
		}
	}

	public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {

		boolean[] rows = new boolean[n];
		boolean[] cols = new boolean[m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (matrix.get(i).get(j) == 0) {
					rows[i] = true;
					cols[j] = true;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (rows[i] || cols[j]) {
					matrix.get(i).set(j, 0);
				}
			}
		}

		return matrix;
	}
}
