package JavaPractice;

import java.util.Scanner;

public class MultiplyTwoBinaryNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        // Input two binary numbers
        System.out.print("Enter first binary number: ");
        String binary1 = sc.nextLine();

        System.out.print("Enter second binary number: ");
        String binary2 = sc.nextLine();

        // Convert binary numbers to decimal
        int decimal1 = Integer.parseInt(binary1, 2);
        int decimal2 = Integer.parseInt(binary2, 2);

        // Sum the decimal numbers
        int sumDecimal = decimal1 * decimal2;

        // Convert the sum back to binary
        String sumBinary = Integer.toBinaryString(sumDecimal);

        // Output the result
        System.out.println("Sum of binary numbers: " + sumBinary);
    }
	}


