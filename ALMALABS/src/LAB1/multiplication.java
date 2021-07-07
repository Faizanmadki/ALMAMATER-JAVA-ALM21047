package LAB1;

import java.util.Scanner;

public class multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner mul = new Scanner(System.in);
	     System.out.println("Enter 1st Number to be Multiplied ");
	     int a = mul.nextInt();
	     System.out.println("Enter 2nd Number to be Multiplied ");
	     int b = mul.nextInt();
	     int prod = a * b;
	     System.out.println("The Product of Two Numbers is "+ prod);
	}

}
