package week1.day1;

public class FibonacciSeries {
	public static void main(String[]args) {
		int range = 8 , firstNum = 0 , secNum = 1;
		int sum ;
		System.out.println(firstNum);
		System.out.println(secNum);
		for(int i=2;i<range;i++) {
			sum= firstNum +secNum;
			System.out.println(sum);
			firstNum=secNum;
			
			secNum=sum;
				
		}

		/* my learning from this code 
		 * 1.for loop iteration
		 * 2.swapping two variables
		 */

	}

}
