package JavaPractice;

import java.util.Scanner;

public class IntToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter integer number: ");
		int i = sc.nextInt();
		
		String binary = Integer.toBinaryString(i);
		System.out.println("Your binary number : " + binary);
	}

}
