package JavaPractice;

import java.util.Scanner;

public class InputsTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first number");
		int a = sc.nextInt();
		System.out.println("Input second number");
		int b = sc.nextInt();
		System.out.println(a+"X"+b+"="+(a*b));
	}

}
