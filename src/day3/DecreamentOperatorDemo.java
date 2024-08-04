package day3;

public class DecreamentOperatorDemo {

	public static void main(String[] args) {
		//Increament operators --
	/*	int a = 100;
	//	a = a -1;
		a --;
		System.out.println(a);
		*/
		//post decreament
		int b = 100;
		int result = b--;
		System.out.println(result);//100
		System.out.println(b);//99
		
		//predecreament
		int c = 100;
		int res = --c;
		System.out.println(res);//99
		

	}

}
