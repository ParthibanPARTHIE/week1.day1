package week1.day1;

public class primenumber {
	public static void main (String[]args) {
		int input = 13;
		boolean flag = false;
		for (int i=2;i<input/2;i++) {
			int j = input%i;
			if(j==0)
			{
				flag=true;
				break;
			}
			
			
		}
		if (flag ==true) 
			System.out.println("Not a prime number" + input);
		else
			System.out.println("prime number" + input);
		
			
		}      /*mylearing from this code
		        *1.conditional statement
		        *2.comparison operator*/
		
		
			
	}


