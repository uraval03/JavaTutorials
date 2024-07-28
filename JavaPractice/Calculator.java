package JavaPractice;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your first number: ");
		int a = sc.nextInt();
		System.out.println("Please enter your second number: ");
		int b = sc.nextInt();
		System.out.println("1.Addition \n2.Substraction \n3.Division \n4.Mutliplication \nPlease select your choice : " );
		int n = sc.nextInt();
		if(n==1) {
			System.out.println(a+b);
		}
		else if(n==2) {
			System.out.println(a-b);
		}
		 else if (n==3) {
			System.out.println(a/b);
	
		}
		else if(n==4) {
			System.out.println(a*b);
		}
		else
		{
			System.out.println("Enter valid choice");
		}
	}

}
