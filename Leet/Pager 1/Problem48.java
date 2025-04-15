public class Problem48 {
	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int N = mat.length;

		System.out.println("Input Matrix:");
		printMatrix(mat);

		rotateMatrix_anticlock(N, mat);

		System.out.println("Rotated Matrix:");
		printMatrix(mat);
	}

	static void printMatrix(int mat[][]) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++)
				System.out.print(mat[i][j] + " ");
			System.out.println();
		}
		System.out.println();
	}

	static void rotateMatrix_anticlock(int N, int mat[][]) {
		for (int x = 0; x < N / 2; x++) {
			for (int y = x; y < N - x - 1; y++) {
				int temp = mat[x][y];
				mat[x][y] = mat[y][N - 1 - x];
				mat[y][N - 1 - x] = mat[N - 1 - x][N - 1 - y];
				mat[N - 1 - x][N - 1 - y] = mat[N - 1 - y][x];
				mat[N - 1 - y][x] = temp;
			}
		}
	}
}
