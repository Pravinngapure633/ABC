
package A;

import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int n=1;
		
		for(int i=n;i<=n;i++) {
			
			if(num%2==0) {
				System.out.println("Even Number is"+num);
				//num++;
			}
			else  {
				System.out.println("Number is Odd"+num);
			}
		}
				
	}
}
