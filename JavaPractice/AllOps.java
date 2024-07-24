package JavaPractice;

import java.util.Scanner;

public class AllOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		System.out.println(a + "+" + b + "=" + (a+b)
				+"\t"+ a + "-" + b + "=" + (a-b) 
				+"\t"+ a + "*" + b + "=" + (a*b) 
				+"\t"+ a + "/" + b + "=" + (a/b)
				+"\t"+ a + "mod" + b + "=" + (a%b));
	}

}
