public class ThreeB {
	public int tryToConvertStringToInteger(String item) {
		try {
			int myNum = Integer.parseInt(item);
			return myNum;
		} catch (NumberFormatException ex) {
			return 0;
		}
	}
}