package JavaPractice;

import java.math.BigDecimal;
import java.util.Scanner;

public class BinaryToOcta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter binary number: ");
		String binaryString = sc.nextLine();
		
		int decimal = Integer.parseInt(binaryString,2);
		
		String octa = Integer.toOctalString(decimal);
		System.out.println("Your Octal number is: " + octa);
		
	}

}
