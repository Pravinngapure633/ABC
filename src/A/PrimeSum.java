package A;

import java.util.Scanner;

public class PrimeSum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<num;i++){
			boolean isPrime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0){
					isPrime=false;
					break;
				}	
			}
			if(isPrime) {
				//System.out.println(i+"");
				sum+=i;
			}
			
		}
		System.out.println(sum);
	}
}
