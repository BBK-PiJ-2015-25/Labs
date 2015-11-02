// Lab6.2 - Copying arrays

public class Lab6 {
	public static void main(String[] args) {
		ArrayCopier ac = new ArrayCopier();
		
		int[] src = {1, 2, 3, 4, 5, 6};
		int[] dest = {4, 5, 6};
		ac.copy(src, dest);
		
		int[] src1 = {1, 2, 3};
		int[] dest1 = {4, 5, 6};
		ac.copy(src1, dest1);
		
		int[] src2 = {1, 2, 3};
		int[] dest2 = {1, 2, 3, 4, 5, 6};
		ac.copy(src2, dest2);
	}
}