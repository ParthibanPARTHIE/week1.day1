package week1.day2;

import java.util.Arrays;

public class Anagram {
	public static void main(String []args) {
		String txt1="amma";
        String txt2="mmaa";
        char var[]=txt1.toCharArray();
        char var1[]=txt2.toCharArray();
        

        Arrays.sort(var);
        Arrays.sort(var1);
        if(Arrays.equals(var, var1))
{
         System.out.println("Angram");
}
        else {
         System.out.println("Not anagram");
}
    }

	}


