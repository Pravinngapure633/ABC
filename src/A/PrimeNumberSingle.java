package A;

import java.util.Scanner;

public class PrimeNumberSingle {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		int count=0;
		
		for(int i=1;i<=num;i++) {
			
			if(num%i==0) {
				count++;
			}
		}
		
		if(count==2) {
			System.out.println("Prime No Is:"+num);
		}
		else {
			System.out.println("Number is not Prime "+num);
		}
		
	}
}
