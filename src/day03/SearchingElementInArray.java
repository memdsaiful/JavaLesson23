package day03;

import java.util.Scanner;
public class SearchingElementInArray {
	//Searching an element from an array\
	public static void main(String[] args) {
		//create an array
		int a[] = {10, 40, 20,30,60, 50, 90, 80};
		boolean status = false; // create a status state
		//declare a number to search for
		Scanner sc = new Scanner(System.in);
		System.out.println("Please type a number to search for.");
		
		for(int i=0; i <a.length; i++) {
			if(search_num == a[i]) {
				System.out.println("Element found!!");
				status = true;
				break;
			}
		}
	   if(status == false) {
		   System.out.println("Sorry!!! Element not found.");
	   }
	}

}
