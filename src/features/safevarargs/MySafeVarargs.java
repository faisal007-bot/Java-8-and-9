package features.safevarargs;

import java.util.ArrayList;
import java.util.List;

// safe varargs annotation can be applied on methods and constructors that takes varargs as an argument
// for methods it is restricted we can use it only on static , final , and private instance methods
// in simple we can apply safeVarargs only on methods and contructors that cannot be overridden

// safevarargs annotation is used to remove the warning of the compiler at the compile time
// to indicate that this method will perform safe operations on variable arguments passed to 
// this method
class Test{
//	using safe varargs on the final method
	@SafeVarargs
	final void print(List<String> ...arr) {
		for(List<String> s:arr) {
			System.out.println(s);
		}
		this.print2(arr);
	}
//	using safevarargs on private methods
	@SafeVarargs
	private void print2(List<String> ...arr) {
		for(List<String> s:arr) {
			System.out.println(s);
		}
	}
//	using safevarargs on static methods
	@SafeVarargs
	public static void print3(List<String> ...arr) {
		for(List<String> s:arr) {
			System.out.println(s);
		}
	}
//	using safevarargs on constructor
	@SafeVarargs
	Test(List<String> ...arr){
		for(List<String> s:arr) {
			System.out.println(s);
		}
	}
}
public class MySafeVarargs {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> s = new ArrayList<String>();
		s.add("faisal");
		s.add("faiz");
		s.add("deadeye");
		Test t = new Test(s);
		t.print(s);
		Test.print3(s);
	}
}
