package A;

import java.util.Scanner;

public class MultiplicationSingle {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter No");
		int num=sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			
			System.out.println(i+"*"+num+"="+(i*num));
		}
	}

}
