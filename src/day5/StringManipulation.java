package day5;

public class StringManipulation {
	
	public static void main(String[] args) {
	
	//String are immutable - it can not be changed
	String s = "Welcome 123"; //string literal
	String s2 = new String("Welcome"); //through string object
	//to learn important methods of String class
	
	//length() -- counts all the characters in a string and returns the number in int data type
	
	 int length = s2.length();
	 System.out.println("The length is: " +length);
	 
	 System.out.println(s.length());//11
	 
	 //concat() - join multiple strings
	 String s1 = "Welcome";
	 String s3 = "to java";
	 String s4 = "Programming.";
	 System.out.println(s1.concat(s3).concat(s4));//Welcome to java programming.
	 
	 //trim()  --would trim any leading and trailing spaces from a string
	 s = " welcome to java ";
	 System.out.println(s.length());
	 s.trim();
	 System.out.println(s.trim().length());
	 
	 //charAt() -- return a single character our of a string from specific index
	 s = "Java Selenium";
	 System.out.println(s.charAt(5));
	 System.out.println(s.charAt(5));
	 
	 //CONTINS() -- RETURN A BOOLEAN (TRUE/FALSE)
	 //check a string is the part of the main string or not
	 
	 System.out.println(s.contains("Jav"));//true
	 System.out.println(s.contains("Sel"));//true
	 System.out.println(s.contains("ium"));//true
	 System.out.println(s.contains("Sli"));//false
	 System.out.println(s.contains("a S"));//true
	 
	 // equals(), equalsIgnoreCase() --> compares two strings and returns true/false
	 s1 = "Welcome";
	 s2 = "Welcome";
	 System.out.println(s1.equals("Welcome"));//false
	 System.out.println(s1.equalsIgnoreCase(s2));//true
	 
	 //replace() - it replaces a single character or character sequence of a given string
	 s = "Welcome to java selenium automation";
	 
	 System.out.println(s.replace("w", "W"));
	 System.out.println(s1.replace("java", "python"));
	 
	 //substring() -- extracts substring from the string
	 System.out.println(s.substring(11));//java selenium automation
	 System.out.println(s.substring(11, 15));//java
	 
	 
	 //toUpperCase()  toLowerCase()  --> converts case
	 s = "Welcome";
	 System.out.println(s.toUpperCase());//Welcome
	 System.out.println(s.toLowerCase());//Welcome
	 
	 //split() -- split or divide original string into multiple parts based on delimiter
	 s = "abc@xyz";
	 String a[] = s.split("@");
	 System.out.println(a[1]);
	 s = "welcome to java selenium automation";
	 String b[] = s.split(" ");
	 System.out.println(b[3]);
	 
	 s = "welcome to java selenium automation";
	 System.out.println(s.replace(" ", "-"));
	 //extract only abc from the followin g string
	 s = "abc,123@m.com";
	 String d1 = "abc";
	 String d2 = "123@m.com";
	 String[] c = s.split(",");
	 System.out.println(c[0]);
	 
	 
	 
	 
	 
	 
	 
			 
	

}
}