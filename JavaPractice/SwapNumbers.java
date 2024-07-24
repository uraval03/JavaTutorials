package JavaPractice;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		int a = 25;
		int b = 15;
		System.out.println("Before swapping : a, b = " + a + "," +  b );
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swapping : a , b = " + a + "," + b );
	}

}
