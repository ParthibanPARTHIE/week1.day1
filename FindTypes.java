package week1.day2;

public class FindTypes {
	public static void main (String[]args) {
		String test = "$$ Welcome to 2nd Class of Automation $$" ;
		int letter = 0 , space = 0 , num =0, specialChar = 0;
		char [] c = test.toCharArray();
		for ( char cha :c) 
		{
			 System.out.println(cha);
			   
			  
			    boolean b1 = Character.isLetter(cha);
			    if(b1==true)
			    {

			   letter++;
			    }
			 boolean b2=Character.isDigit(cha);
			 if(b2==true)
			 {
			  

			  num++;
			 }
			 boolean b3=Character.isSpaceChar(cha);
			 if(b3==true)
			  {
			   

			  space++;
			  }
			 else
			  {
			   specialChar++;
			    
			     
			  }
			  System.out.println("letter: " + letter);
			  System.out.println("space: " + space);
			  System.out.println("number: " + num);
			  System.out.println("Special character:"+specialChar);
			  
			  }
			 }
			
		}
	


