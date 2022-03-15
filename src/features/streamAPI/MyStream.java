package features.streamAPI;

import java.util.ArrayList;
import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;

public class MyStream {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(8);
		list.add(48);
		list.add(87);
		list.add(8);
		list.add(78);
		
//		stream method of the collection is used to get the object of stream
//		Stream<Integer> s = list.stream();
		
//		filter method of stream is used to provide predicate which returns boolean
//		List<Integer> filter = list.stream().filter(e->e%2==0).collect(Collectors.toList());
//		System.out.println(filter);
		
//		map method is used to provide the function inside the argument
//		List<Integer> map = list.stream().map(a->a+100).collect(Collectors.toList());
//		System.out.println(map);
		
//		count method returns the number of objects present in the stream
//		long count = list.stream().count();
//		System.out.println(count);
		
//		allmatch method returns true if all the objects of the stream satisfies the provided
//		predicate condition
//		boolean allMatch = list.stream().allMatch(e->e%2==0);
//		System.out.println(allMatch);
		
//		anymatch method returns true if atleast one element of the stream satisfies the provided
//		predicate condition
//		boolean anyMatch = list.stream().anyMatch(e->e%2==0);
//		System.out.println(anyMatch);
		
//		distinct method returns all the elements of the stream that are unique it removes 
//		the duplicate elements present in the stream
//		List<Integer> distinct = list.stream().distinct().collect(Collectors.toList());
//		System.out.println(distinct);
		
//		foreach method of stream takes consumer and processes all the elements of the stream
//		list.stream().forEach(e->System.out.println(e+100));
		
//		limit method only takes the provided elements in the limit parameter in the stream
//		it discards the remaining elements of the collection from the stream
//		List<Integer> limit = list.stream().limit(2).collect(Collectors.toList());
//		System.out.println(limit);
		
//		max method returns the last element of the stream according to the provided sorting order
//		if the sorting is descending then it will return last element which will be smallest
//		so in simple max means the last element present in the stream
//		Optional<Integer> max = list.stream().max((a,b)->(a>b)?-1:(a<b)?+1:0);
//		System.out.println(max);
		
//		min method returns the first element of the stream according to the provided sorting order
//		if the sorting is descending then it will return first element which will be largest
//		so in simple min means the first element present in the stream
//		Optional<Integer> min = list.stream().min((a,b)->(a>b)?+1:(a<b)?-1:0);
//		System.out.println(min);
		
//		skip methods skips the specified elements in the skip methods parameters and it will 
//		simply return all the remaining elements
//		List<Integer> skip = list.stream().skip(2).collect(Collectors.toList());
//		System.out.println(skip);
		
//		sorted method returns the stream of objects according to the natural sorting order
//		if no comparator object is specified
//		List<Integer> sortedAsc = list.stream().sorted().collect(Collectors.toList());
//		System.out.println(sortedAsc);
		
//		sorted method of the stream if passed comparator then it returns the stream objects
//		according to the customized sorting order
//		List<Integer> sortedCustom = 
//				list.stream().sorted((a,b)->(a>b)?-1:(a<b)?1:0).collect(Collectors.toList());
//		System.out.println(sortedCustom);
		
//		toarray method of the stream is used to convert the stream into the array
//		we need to use the constructor reference to create the object of array
//		Integer[] array = list.stream().toArray(Integer[]::new);
//		for(Integer i:array) {
//			System.out.print(i+" ");
//		}
		
//		converting the array into stream using the of(array) or of(sequence of arguments)
//		or of(varargs) method
//		Integer[] arr = {11,22,33,442,42};
//		Stream<Integer> ofArray = Stream.of(arr);
//		List<Integer> of = ofArray.collect(Collectors.toList());
//		System.out.println(of);
//		Stream<Integer> varargs = Stream.of(1,2,4,5,4,7,4,5);
//		List<Integer> of = varargs.collect(Collectors.toList());
//		System.out.println(of);
		
//		takewhile methods process elements of the stream according to the provided predicate
//		when the predicate returns false it skips the checking of the remaining elements of the 
//		stream and it returns the subset of the stream
//		List<Integer> takeWhile = list.stream().takeWhile(e->e%2==0).collect(Collectors.toList());
//		System.out.println(takeWhile);
		
//		this method drops all the elements which satisfies the provided predicate condition
//		when the predicate returns false it skips the checking of remaining elements
//		List<Integer> dropWhile = list.stream().dropWhile(e->e%2==0).collect(Collectors.toList());
//		System.out.println(dropWhile);
		
//		iterate method takes three parameters 
//		first the start element it will be printed as it is
//		second it takes predicate it works until the provided predicate
//		third it takes increment predicate everytime it increments with the next element instead 
//		of the start element
//		like first 4 will be considered then after checking second parameter it will be printed 
//		bcoz it returns true then it will check the third parameter and perform the increment 
//		4+3 = 7 then checks the second parameter then it will print then it checks the third 
//		parameter and it will print until the provided predicates turns to false
//		Stream.iterate(4, e->e<=100,e->e+3).forEach(System.out::println);
		
//		chaining of the stream methods is possible
//		collect method is used to collect the element of the stream
//		Collectors class also contain many static methods for collecting the stream of objects
	}
}
