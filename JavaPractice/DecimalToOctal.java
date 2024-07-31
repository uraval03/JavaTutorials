package JavaPractice;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter decimal number: ");
		int i = sc.nextInt();
		
		String octal = Integer.toOctalString(i);
		System.out.println("Your octal number is: " + octal);
				
	}

}
