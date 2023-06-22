import java.util.Scanner;

public class OneToNNumber {

	
	public static void main(String[] args) {
		
		System.out.println("Enter A Number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		
		for(int i=1;i<=num;i++) {
			System.out.println(i);
		}
		
		
//		for(int i=num;i>=1;i--) {
//			System.out.println(i);
//		}
		
	}
}
