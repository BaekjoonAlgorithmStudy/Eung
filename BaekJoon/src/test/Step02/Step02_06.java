package test.Step02;

import java.util.Scanner;

public class Step02_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();		

		System.out.println((num1+num2)%num3);
		System.out.println((num1%num3+num2%num3)%num3);
		System.out.println((num1*num2)%num3);
		System.out.println((num1%num3*num2%num3)%num3);		
	}
}
