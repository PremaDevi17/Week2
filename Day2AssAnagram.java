package week2.day1;

import java.util.Arrays;

public class Day2AssAnagram {
   public static void main(String[] args) {
	String text1 = "stops";
	String text2 = "potss";
	int length1 = text1.length();
	int length2 = text2.length();
	if(length1==length2) {
		System.out.println("Both String lenght is same");
	}
	
	char[] a = text1.toCharArray();
	char[] b = text2.toCharArray();
	
	Arrays.sort(a);
	Arrays.sort(b);
	
	boolean equals = Arrays.equals(a, b);
	System.out.println("Both arrays has same value : " + equals);
}
}
