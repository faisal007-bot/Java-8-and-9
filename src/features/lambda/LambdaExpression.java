package features.lambda;

public class LambdaExpression {
	public static void main(String[] args) {
//		lambda expression
//		it doesnt contain method name , modifiers , return type 
//		we can also skip passing the datatype of the method parameters
//		implementing lambda using functional interface
//		functional interface contains only one abstract method thats why lambda expression 
//		works with functional interface only
		
//		lambda expression  for runnable
//		Runnable r = ()->{
//			for(int i=0;i<=10;i++) {
//				System.out.println("child thread");
//			}
//		};
//		Thread t = new Thread(r);
//		t.start();
//		for(int i=0;i<=10;i++) {
//			System.out.println("main thread");
//		}
		
//		anonymous inner class for runnable
		Runnable r1 = new Runnable() {
			public void run() {
				for(int i=1;i<=10;i++) {
					System.out.println("child thread");
				}
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		for(int i=1;i<=10;i++) {
			System.out.println("main thread");
		}
//		if lambda expression contains only one statement curly braces are optional
//		if multiple lines are present then curly braces are mandatory
//		for return typed lambda return keyword is not allowed without curly braces
//		but if curly braces are present then return statement must be present
//		parameters data type is also optional 
//		for single parameter parentheses are also optional
//		lambda can only be used with functional interface only.
	}		
}
