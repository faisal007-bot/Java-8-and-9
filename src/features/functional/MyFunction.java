package features.functional;

//import java.util.Random;
//import java.util.function.BiConsumer;
//import java.util.function.BiFunction;
//import java.util.function.Consumer;
//import java.util.function.DoubleFunction;
//import java.util.function.DoubleToIntFunction;
//import java.util.function.DoubleToLongFunction;
//import java.util.function.Function;
//import java.util.function.IntFunction;
//import java.util.function.IntToDoubleFunction;
//import java.util.function.IntToLongFunction;
//import java.util.function.LongFunction;
//import java.util.function.LongToDoubleFunction;
//import java.util.function.LongToIntFunction;
//import java.util.function.ToDoubleBiFunction;
//import java.util.function.ToDoubleFunction;
//import java.util.function.ToIntBiFunction;
//import java.util.function.ToIntFunction;
//import java.util.function.ToLongBiFunction;
//import java.util.function.ToLongFunction;

public class MyFunction {
	public static void main(String[] args) {
//		function takes 2 parameter fist is of any type as an argument and return type can also be
//		any type 
//		Function<Integer, Integer> f = n->n*n;
//		System.out.println(f.apply(10));
		
//		utility methods of the function
//		Function<Integer, Integer> f1 = n->n+n;
//		Function<Integer, Integer> f2 = n->n*n;
//		andthen method first calculate f1 and then f2
//		System.out.println(f1.andThen(f2).apply(4));
//		andthen method first calculate f2 and then f1
//		System.out.println(f1.compose(f2).apply(4));
		
//		bifunction takes three parameters first 2 parameters are the type of arguments
//		third parameter represent return value
//		BiFunction<Integer, Integer, Integer> f = (n1,n2)->n1+n2;
//		System.out.println(f.apply(10, 1000));
		
//		primtive types of function
		
//		the argumnet is of int type and return type can be of any type
//		IntFunction<Integer> i = n->n*n;
//		System.out.println(i.apply(10));
		
//		the argumnet is of double type and return type can be of any type
//		DoubleFunction<Double> d = n->n*n;
//		System.out.println(d.apply(2.5d));
		
//		the argumnet is of long type and return type can be of any type
//		LongFunction<Long> l = n->n*n;
//		System.out.println(l.apply(23L));
		
//		the provided type can be of any type but the return type can be of int 
//		ToIntFunction<Integer>  i = n->n*n;
//		System.out.println(i.applyAsInt(10));
		
//		the provided type can be of any type but the return type can be of long 
//		ToLongFunction<Integer> l = n->n*n;
//		System.out.println(l.applyAsLong(20));
		
//		the provided type can be of any type but the return type can be of double 
//		ToDoubleFunction<Integer> d = n->n*n;
//		System.out.println(d.applyAsDouble(10));
		
//		the argument type is int and the return type is double
//		IntToDoubleFunction id = n->n+n;
//		System.out.println(id.applyAsDouble(10));
//		the argument type is int and the return type is long
//		IntToLongFunction il = n->n*n;
//		System.out.println(il.applyAsLong(47));
		
//		the argument type is long and the return type is double
//		LongToDoubleFunction ld = n->n+n;
//		System.out.println(ld.applyAsDouble(34l));
//		we need to typecast the argument of long type into int type else it cant be converted
//		the argument type is long and the return type is int
//		LongToIntFunction li = n->(int)n+(int)n;
//		System.out.println(li.applyAsInt(4));
		
//		we need to typecast the argument of double type into int type else it cant be converted
//		DoubleToIntFunction di = n->(int)n*(int)n;
//		System.out.println(di.applyAsInt(20d));
//		we need to typecast the argument of double type into long type else it cant be converted
//		the argument type is double and the return type is long
//		DoubleToLongFunction dl = n->(long)n*(long)n;
//		System.out.println(dl.applyAsLong(2d));
		
//		this method takes 2 input of any type and returns the output of int type
//		ToIntBiFunction<Integer, Integer> i = (n1,n2)->n1*n2;
//		System.out.println(i.applyAsInt(10, 10));
//		this method takes 2 input of any type and returns the output of long type
//		ToLongBiFunction<Integer, Integer> l = (i1,i2)->i1+i2;
//		System.out.println(l.applyAsLong(22, 11));
//		this method takes 2 input of any type and returns the output of double type
//		ToDoubleBiFunction<Integer, Long> d = (i1,l1)->i1+l1;
//		System.out.println(d.applyAsDouble(12, 23L));
	}
}
