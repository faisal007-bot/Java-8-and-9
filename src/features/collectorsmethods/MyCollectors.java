package features.collectorsmethods;

import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//import java.util.stream.Collectors;

public class MyCollectors {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(47);
		l.add(67);
		l.add(7);
		l.add(4);
		l.add(78);
//		toset method is used to get the set representation of the provided stream
//		Set<Integer> set = l.stream().filter(e->e%2!=0).collect(Collectors.toSet());
//		System.out.println(set);
		
//		tolist method is used to get the list representation of the provided stream
//		List<Integer> list = l.stream().filter(e->e%2!=0).collect(Collectors.toList());
//		System.out.println(list);
		
//		tomap method is used to get the map representation of the provided stream it takes 
//		2 functions 1 for key and 1 for value
//		Map<Integer, Integer> map = l.stream().collect(Collectors.toMap(a->a*4, a->a+2));
//		System.out.println(map);
		
//		toUnmodifiableList method returns unmodifiable list of the stream
//		List<Integer> unmodifiableList =
//				l.stream().filter(e->e%2==0).collect(Collectors.toUnmodifiableList());
//		System.out.println(unmodifiableList);
		
//		toUnmodifiableSet method returns unmodifiable set of the stream
//		Set<Integer> unmodifiableSet =
//				l.stream().filter(e->e%2!=0).collect(Collectors.toUnmodifiableSet());
//		System.out.println(unmodifiableSet);
		
//		toUnmodifiableMap method returns unmodifiable map of the stream
//		Map<Integer, Integer> unmodifiableMap =
//				l.stream().collect(Collectors.toUnmodifiableMap(k->k+10, v->v*10));
//		System.out.println(unmodifiableMap);
	}
}
