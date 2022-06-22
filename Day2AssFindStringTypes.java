package week2.day1;

public class Day2AssFindStringTypes {
  public static void main(String[] args) {
	  String test = "$$ Welcome to 2nd Class of Automation $$ ";
	  int  letter = 0;
	  int space = 0;
	  int num = 0;
	  int specialChar = 0;
	  
	  char[] a = test.toCharArray();
	 
	 
	  for (int i = 0;i<=a.length-1;i++){
		  
		  if( Character.isLetter(a[i])){
			  letter++;
		  }
		  else if( Character.isDigit(a[i])){
			  num++;			  
		  }
		  else if (Character.isSpaceChar(a[i])) {
			  space++;
		  }
		  else {
			  specialChar++;
		  }
		 	  }
	 
			System.out.println("letter: " + letter);
			System.out.println("space: " + space);
			System.out.println("number: " + num);
			System.out.println("specialCharcter: " + specialChar);
	  
}
}
