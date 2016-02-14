public class MatrixChecker {

	public boolean isSymmetrical(int[] matrix) {
		int l = matrix.length;

		if (l % 2 == 1) {
			return false;
		} else {
			int half = l / 2;

			for (int i = 0; i < half; i++) {
				if (matrix[i] != matrix[l - i-1]) {
					return false;
				}
			}
		}

		return true;
	}

	public boolean isSymmetrical(int[][] matrix) {
		int l = matrix.length;

		for (int i = 0; i < l; i++) {
			if (matrix[0][i] != matrix[1][l - i-1]) {
				return false;
			}
		}

		return true;
	}

	public boolean isTriangular(int[][] matrix) {
		int l = matrix.length;

		if (matrix[1][0] == 0) {
			return true;
		}

		return false;
	}
}