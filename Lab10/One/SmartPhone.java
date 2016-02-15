public class SmartPhone extends MobilePhone {
	
	public SmartPhone() {
		super("Apple");
	}
	
	public void browseWeb(String url) {
		System.out.println("Request: " + url);
	}
	
	public String findPosition() {
		return "50.12345,-1.67899";
	}
	
	public void playGame(String name) {
		System.out.println("Starting game: " + name);
	}
}