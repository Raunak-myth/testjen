package demo;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		System.out.println("Enter First Number");
		a = sc.nextInt();
		System.out.println("Enter Second Number");
		b = sc.nextInt();
	
	
		System.out.println("The Sum of the Numbers is "+(a+b));
		System.out.println("The Difference Of the Numbers is "+(a-b));
		System.out.println("The Multiplication of Numbers is "+(a*b));
		
		
		sc.close();
		
	}

}
