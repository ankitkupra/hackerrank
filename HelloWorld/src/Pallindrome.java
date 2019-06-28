import java.util.Scanner;

public class Pallindrome {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char[] str2 = str.toCharArray();
		System.out.print(str);
		System.out.print("\n"+str2.length);
		/*for(int i =0; i<str2.length;i++) {
			if(str2[i] == str2[str2.length-1+i]) {
				System.out.print(str);
			}
			else {
				System.out.println(str2[i]);
			}
		}*/
	}

}
