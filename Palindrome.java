package week1.day2;

public class Palindrome {
	public static void main(String[] args) {
		String value = "madam";
		String revValue ="";
		for (int i = value.length()-1; i>=0; i--) {
			revValue = revValue + value.charAt(i);
		}
		System.out.println(revValue);
		if (value.equals(revValue))
			System.out.println("palindrome");
		else 
			System.out.println("Not palindrome");
			
		
		
	}
	

}
