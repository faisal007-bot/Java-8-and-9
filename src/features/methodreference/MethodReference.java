package features.methodreference;

class Test{
//	in method and constructor reference modifiers return type method name doesnt matter
//	but the number or the type of arguments of the target method must be same 
//	else exception will occur
//	it can only be used with functional interface
//	method and constructor reference is mostly used to use the already present code 
//	it can be advanced of lambda expression
	public static void method1() {
		for(int i=0;i<10;i++) {
			System.out.println("child"+i);
		}
	}
	
	public void method2() {
		for(int i=0;i<10;i++) {
			System.out.println("child"+i);
		}
	}
	
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}

	Test(int a,int b){
		System.out.println("object created");
	}
}
@FunctionalInterface
interface Inter{
//	Test create(int a,int b);
	Test create();
}
public class MethodReference {
	public static void main(String[] args) {
		
//		using static method for reference
//		Runnable r = Test::method1;
//		Thread t = new Thread(r);
//		t.start();
		
//		using the instance method for reference
//		Test t = new Test(11,22);
//		Runnable r = t::method2;
//		Thread t1 = new Thread(r);
//		t1.start();
		
//		using constructor as a reference
//		constructor reference is mostly use to create the object
		Inter i = Test::new;
		Test t = i.create();
		System.out.println(t.hashCode());
		
//		Inter i = Test::new;
//		Test t = i.create(11, 22);
//		System.out.println(t.hashCode());
	}
}
