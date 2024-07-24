package JavaPractice;

import java.util.Scanner;

public class FindAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first numb");
		int a = sc.nextInt();
		System.out.println("Enter second numb");
		int b = sc.nextInt();
		System.out.println("Enter third numb");
		int c = sc.nextInt();
		System.out.println("Average = " + (a+b+c)/3);
	}

}
