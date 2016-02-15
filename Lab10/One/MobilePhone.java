public class MobilePhone extends OldPhone {
	
	public MobilePhone(String brand) {
		super(brand);
	}
	
	@Override
	public void call(String number) {
		if (number.substring(0, 2).equals("00")) {
			System.out.println("Calling: " + number + " through the internet to save money.");
		} else {
			super.call(number);
		}
	}
	
	public void ringAlarm(String time) {
		System.out.println("Alarm will sound at: " + time);
	}
	
	private void playGame(String name) {
		System.out.println("Starting game: " + name);
	}
}