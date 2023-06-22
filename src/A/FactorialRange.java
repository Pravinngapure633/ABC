package A;

import java.util.Scanner;

public class FactorialRange {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			
			int fact=1;
			for(int j=2;j<=i;j++) {
				fact=fact*j;
			}
			
			System.out.println("fact"+fact);
		}
	}
}
