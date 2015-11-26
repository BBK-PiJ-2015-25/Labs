// Lab6.3 - Creating matrices

public class Lab6 {
	public static void main(String[] args) {
		System.out.println("Lab6.3 - Creating matrices");

		Matrix matrix = new Matrix(2, 3);
		
		matrix.setElement(1, 2, 88);
		matrix.prettyPrint();

		matrix.setRow(1, "1,2,3");
		matrix.prettyPrint();

		matrix.setColumn(1, "5,6");
		matrix.prettyPrint();

		System.out.println(matrix.toString());

		System.out.println("Goodbye.");
	}
}