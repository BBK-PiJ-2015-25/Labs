public class ArrayCopier {
	public int[] copy(int[] src, int[] dest) {
		int srcL = src.length;
		int destL = dest.length;
		
		int[] end = new int[destL];
		
		for (int i = 0; i < destL; i++) {
			
			if (i >= srcL) {
				end[i] = 0;
			} else {
				end[i] = src[i];
			}
		}
		
		// Testing
		for (int x = 0; x < end.length; x++) {
			System.out.println(end[x]);
		}
		System.out.println("-----");
		
		// Temp return while testing
		return src;
	}
}