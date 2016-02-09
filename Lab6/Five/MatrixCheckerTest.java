// Lab 6.5 - Symmetry looks pretty
public class MatrixCheckerTest {
	public static void main(String[] args) {
		System.out.println("Lab 6.5 - Symmetry looks pretty");

		MatrixChecker matricChecker = new MatrixChecker();

		int[] noSym = new int[4];
		noSym[0] = 1;
		noSym[1] = 2;
		noSym[2] = 3;
		noSym[3] = 4;
		System.out.println(matricChecker.isSymmetrical(noSym));

		int[] sym = new int[4];
		sym[0] = 1;
		sym[1] = 2;
		sym[2] = 2;
		sym[3] = 1;
		System.out.println(matricChecker.isSymmetrical(sym));

		int[][] noSym = new int[4];
		noSym[0] = 1;
		noSym[1] = 2;
		noSym[2] = 3;
		noSym[3] = 4;
		System.out.println(matricChecker.isSymmetrical(noSym));

		// int[] sym = new int[4];
		// sym[0] = 1;
		// sym[1] = 2;
		// sym[2] = 2;
		// sym[3] = 1;
		// System.out.println(matricChecker.isSymmetrical(sym));

		System.out.println("Goodbye.");
	}
}