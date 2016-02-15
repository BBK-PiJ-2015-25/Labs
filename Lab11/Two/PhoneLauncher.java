public class PhoneLauncher {
	public static void main(String[] args) {
		System.out.println("Lab 10.1 -  Extension, extension. . .");
		
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
		
		MobilePhone myPhone = new SmartPhone();
		launcher.testPhone(myPhone);
		
		System.out.println("End.");
	}
	
	public void launch() {
		SmartPhone smartPhone = new SmartPhone();
		
		smartPhone.browseWeb("https://www.google.co.uk");
		System.out.println("Geopoint: " + smartPhone.findPosition());
		smartPhone.call("111111");
		smartPhone.call("222222");
		smartPhone.call("333333");
		smartPhone.call("444444");
		smartPhone.call("555555");
		smartPhone.call("666666");
		smartPhone.call("777777");
		smartPhone.call("888888");
		smartPhone.call("999999");
		smartPhone.call("000000");
		smartPhone.call("111111");
		
		smartPhone.printLastNumbers();
		
		System.out.println("Brand is '" + smartPhone.getBrand() + "'");
		
		smartPhone.playGame("Snake");
		
		//RestrictedSmartPhone restrictedSmartPhone = new RestrictedSmartPhone();
		//restrictedSmartPhone.playGame("Candy Crush");
	}
	
	public void testPhone(Phone phone) {
		System.out.println("----------------");
		System.out.println("testPhone");
		phone.call("12345680");
		// Find position throws a compile error because Phone does not have access to the methods inside the SmartPhone class.
		// phone.findPosition();
		
		SmartPhone smartPhone = (SmartPhone) phone;
		System.out.println(smartPhone.findPosition());
	}
}