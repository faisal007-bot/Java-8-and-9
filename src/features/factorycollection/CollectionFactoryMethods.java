package features.factorycollection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionFactoryMethods {
	public static void main(String[] args) {
//		factory methods of the collection is used to create the unmodifiable collection
//		if we try to add anymore elements into the collection it will throw an error
//		null values are not allowed
//		creating unmodifiable list using static method of();
		List<Integer> list = List.of(43,43,3,22,34,2,423,5);
		list.forEach(e->System.out.print(e+" "));
//		it will throw an exception of java.lang.UnsupportedOperationException
//		list.add(45);
		System.out.println();
//		-------------------------------------------------
		
//		creating unmodifiable set using static method of();
//		in set at the time of passing the values duplicate values are not allowed  
//		null values are not allowed
//		it  will throw an error of  java.lang.IllegalArgumentException
		Set<Integer> set = Set.of(43,3,22,34,2,423,5);
		set.forEach(e->System.out.print(e+" "));
		System.out.println();
//		-------------------------------------------------
		
//		creating unmodifiable map using static method of();
//		in map if we try to add duplicate key at the time of creating the map object
//		it will also throw an error of java.lang.IllegalArgumentException
//		both null key and value is not allowed
		Map<Integer, String> map = Map.of(11,"faisal",44,"deadeye",78,"neko");
		map.forEach((k,v)->System.out.print(k+" "+v+" "));
	}
}
