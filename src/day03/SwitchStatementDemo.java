package day03;

public class SwitchStatementDemo {

	
	

	public static void main(String[] args) {
		/* Conditional statements
		 *
		 *if
		 *if else
		 *switch statement
		 **/
		
		int variable = 0;
		switch(variable) {
		case 1: {
			//code
			break;
		}
		case 2: {
			//code
			
		}
		default:
		{  
		//code
		}
		
		
		int num = 1;
		switch(num) {
		case 1: {
			System.out.println("Monday");
			break;
		}
		case 2: {
			System.out.println("Tuesday");
			break;
		}
		case 3: {
			System.out.println("wednesday");
			break;
		}
		default: {
			System.out.println("This number is not any day of the week");
		}
		}
		System.out.println("Out of switch statement");
		}
		
		determineBrowser("chrome");
	}
		public static void determineBrowser(String browserName) {
			switch(browserName) {
			case "chrome":{
				System.out.println("Launched chrome browser.");
				break;
			}
			case "firefox":{
				System.out.println("Launched firefox browser.");
				break;
			}
			case "edge":{
				System.out.println("Launched edge browser.");
				break;

			}
			default: {
				System.out.println("This browser is not supported");
			}
		}
		
		
		
		
		
		
		
		
		
		
		}
}