package week1.day2;

public class Mobile  {
	public void sendMessage(String message) {
		System.out.println(" Message sent      :" + message);
	}
	private long makeCall () {
		long MobileNumber = 1234567890;
		return MobileNumber;
		
				
	}
	void saveContact (String name ) {
		System.out.println(" SAVED CONTACT NAME :" + name );
	
	}
	public static void main (String [] args) {
		Mobile detail = new Mobile ();
		long Number = detail.makeCall();
		System.out.println("Caller No:" + Number);
		detail.saveContact("parthiban");
		System.out.println("      CONTACT NUMBER :" + Number);
		detail.sendMessage("Assignment completed");
		
		
	}
	
	

}
