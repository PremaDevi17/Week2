package week2.day1;

public class Day2AssReverseEvenWords {
 public static void main(String[] args) {
	 String test = "I am a software tester"; 
	 String[] split = test.split(" ");
	 String a = "";
	 
	 for(int i=0;i<split.length;i++) {
		 
		 String rev = "";
				 
		 int even = i%2;
		 if(even==1) {
			 char[] charArray = split[i].toCharArray();
			 for(int j=charArray.length-1;j>=0;j--) {
				 rev = rev + charArray[j];
				 
			 }
			 a = a+rev+" ";			 
		 }	
		 else {
			 a = a+split[i]+" ";
		 }
	 }
	 System.out.println(a);
}
}
