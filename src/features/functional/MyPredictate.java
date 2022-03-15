package features.functional;

//import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
//import java.util.function.Predicate;

public class MyPredictate {
	public static void main(String[] args) {
		
		
//		predicate takes any type of input and returns boolean 
//		Predicate<Integer> p1 = n -> n%2==0;
//		System.out.println(p1.test(10));
//		System.out.println(p1.test(11));
		
		
//		utility methods of predicate interface
//		Predicate<Integer> p1 = n->n>20;
//		Predicate<Integer> p2 = n->n%2==0;
//		System.out.println(p1.and(p2).test(40));
//		System.out.println(p1.or(p2).test(203));
//		System.out.println(p1.negate().test(22));
		
//		bipredicate is used to pass 2 parameters 
//		BiPredicate<Integer, Integer> p1 = (n1,n2)->n1*n2%2!=0;
//		System.out.println(p1.test(10, 4));
		
//		utility methods for bipredicate
//		BiPredicate<Integer, Integer> p1 = (n1,n2)->n1+n2%2>10;
//		BiPredicate<Integer, Integer> p2 = (n1,n2)->n1+n2%2==0;
//		System.out.println(p1.and(p2).test(10, 20));
//		System.out.println(p1.or(p2).test(20, 10));
//		System.out.println(p1.negate().test(10, -10));
		
//		predicate from primitive data types all the utility methods like and or and negate are 
//		available.
//		it takes int value 
		IntPredicate i = n->n%2==0;
		System.out.println(i.test(10));
//		it takes long value 
		LongPredicate l = n->n%2==0;
		System.out.println(l.test(20L));
//		it takes double value 
		DoublePredicate d = n->n%2==0;
		System.out.println(d.test(56d));
	}
}
