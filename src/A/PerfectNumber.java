package A;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter	a	number");
		int num = sc.nextInt();
		int sum = 1;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(sum==num) {
			System.out.println("Number is perfect"+num);
		}
		else {
			System.out.println("Number is not perfect"+num);
			
		}
	}
}
