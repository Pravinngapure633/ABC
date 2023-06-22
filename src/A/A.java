package A;

import java.util.function.Predicate;

@FunctionalInterface
interface X{
	public abstract Integer m1(int i);
}
//@FunctionalInterface
//interface Y{
//	public abstract void m1(int i);
//}
public class A {


	
	
	public static void main(String[] args) {
		
	 X x=(int i)->i*i;
	 
	// x.m1(10);
	 System.out.println(x.m1(10));
	 
		
	}
}
