package JavaPractice;

import java.util.Scanner;

public class DecimalToHexa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please neter Decimal number: ");
		int i = sc.nextInt();
		
		String hexa = Integer.toHexString(i);
		System.out.println("Your hexdecimal number is: " + hexa);
	}

}
