package week1.day2;

public class Charoccurance {
	public static void main (String[]args) {
		String str = "welcome to chennai ";
	//	char[] String1 = str.toCharArray();
	//	int lengthofArray = String1.length;
		//System.out.println("length of Array" + lengthofArray);
		char search = 'c';
		int count =0;
		for (int i =0; i<str.length(); i++) {
			if (search == str.charAt(i))
				count ++;
		}
		System.out.println("count of"  +   search + "is"  +   count);
		
		
		
		
		
	}

}
