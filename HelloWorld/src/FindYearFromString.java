/**@author 
 * ankitkumar
 * */

/*
 * Approach
 * 1. Input the string.
 * 2. Iterate the string till it finds digits.
 * Check if the length of the digit is 4.
 * If yes, count the size of the Unordered Set
 * */

import java.util.HashSet;
import java.util.Scanner;

public class FindYearFromString {
	public static void main(String args[]) throws Exception{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(distinctYear(str));
	}

	static int distinctYear(String str) {
		// TODO Auto-generated method stub
		String str1 = "";
		HashSet<String> uniqueYears = new HashSet<String>();
		for(int i =0 ; i<str.length(); i++) {
			//Check if the string contains the digit
			if(Character.isDigit(str.charAt(i))) {
				str1 += str.charAt(i);
			}
			if(str.charAt(i) == '-') {
				str1 = "";
			}
			if(str1.length() == 4) {
				uniqueYears.add(str1);
				str1 = "";
			}
		}
		return uniqueYears.size();
	}

}
