package A;

import java.util.Scanner;

public class PalindromNumber {
	
	public static void main(String[] args) {
		
		//121 reverse 121,151-151 palindrome no
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int tem=num;
		int rev=0;
		int rem=0;
		
		
		while(tem!=0)
		{
			rem=tem%10;
			rev=rev*10+rem;
			tem=tem/10;
		}
		if(num==rev) {
			System.out.println("NUmber is Palindrome"+num);
		}
	}

}
