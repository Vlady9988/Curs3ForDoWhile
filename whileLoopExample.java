package curs3;

import java.util.Scanner;

public class whileLoopExample {

	public static void main(String[] args) {
		
		System.out.println("please enter a number: ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		
		for (int i=1; i<=10; i++) {
			
			System.out.println("----------------------------------------");
			
			int x=1;
			while(x<=10) {
				System.out.println(number + "*" + x + " = " +number*x);
				x++;
				
			}
			
		}
		
		
		
		
				
	

	}

}
