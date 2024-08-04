package day6;

public class CheckPalindrome {
	
	public static void main(String[] args) {
		//Q6. Remove Junk or Special character from a String
		
		String input = "adda";
		
		System.out.println("Given string is a palindrome = " + isPalindrome(input));
		String doubtfulInput = "This is my string with special characters :_*&^%$#$#@!";
		String result = doubtfulInput.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(result);
	}







 public static boolean isPalindrome(String str) {
	 
	 String reversed = "";
	 for(int i = str.length() -1; i >=0; i--) {
		 reversed += str.charAt(i);
	 }
	 return str.equals(reversed);
 }
 }