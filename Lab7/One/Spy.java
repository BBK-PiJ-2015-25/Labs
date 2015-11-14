public class Spy {

	private static int spyCount = 0;
	private int spyId;
	
	public static void main (String[] args) {
		Spy spyOne = new Spy(2);
		Spy spyTwo = new Spy(4);
		Spy spyfgf = new Spy(5);
		spyfgf.die();
		Spy spyrt = new Spy(7);
		Spy spyer = new Spy(9);
	}
	
	public Spy(int spyId) {
		this.spyId = spyId;
		System.out.println("Spy ID: " + spyId);
		Spy.spyCount++;
		System.out.println("Total number of spies: " + Spy.spyCount);
	}
	
	public void die() {
		Spy.spyCount--;
		System.out.println("Spy " + this.spyId + " has been detected and eliminated");
		System.out.println("Total number of spies: " + Spy.spyCount);
	}
}