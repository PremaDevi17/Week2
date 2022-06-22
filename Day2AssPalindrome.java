package week2.day1;

public class Day2AssPalindrome {
   public static void main(String[] args) {
	String Text = "madam";
	String rev = "";
	char[] charArray = Text.toCharArray();
	
	for(int i = charArray.length-1;i>=0;i--) {
		rev = rev+ charArray[i];
		
	}
	
	boolean equals = rev.equals(Text);
	if (equals = true) {
		System.out.println("The String is an Palindrome");
	}
	
	else {
		System.out.println("The String is not Palindrome");
	}
}
}
