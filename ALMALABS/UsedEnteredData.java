package LAB1;
import java.util.Scanner;
public class UsedEnteredData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Dynamic Code Example
		Scanner input = new Scanner(System.in); 
		 System.out.print("Enter a number: "); 
		int n1 = input.nextInt();
		System.out.println("Enter Another Number: ");
		int n2 = input.nextInt();
		int n3 = n1 - n2;
		System.out.println("Substraction will be: " + n3);
	}

}
