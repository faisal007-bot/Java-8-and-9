package features.reflect;

//import java.lang.reflect.Constructor;
//import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Comparator;

// reflect package is used to get the metadata of the class
class Test implements Comparator<Integer>{
	int a = 10 , b = 20;
	public static void sum(int x,int y) {
		System.out.println(x+y);
	}
	public void display() {
		System.out.println("display method");
	}
	@Override
	public int compare(Integer o1, Integer o2) {
		return 0;
	}
	public Test(int a, int y) {
		super();
		this.a = a;
		this.b = y;
	}
	public Test() {
		super();
	}
}
public class MyReflection {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Test t = new Test();
		Class<? extends Test> c = t.getClass();
		
//		returns all the declared methods inside the class
//		Method[] methods = c.getMethods();
//		for(Method m:methods) {
//			System.out.println(m.getName());
//		}
		
//		it returns all the interfaces implemented by this class
//		Class<?>[] interfaces = c.getInterfaces();
//		for(Class<?> x:interfaces) {
//			System.out.println(x.getName());
//		}
		
//		it returns all the constructors defined in the class it doesnt show any constructor
//		if user hasnt declared any constructor
//		Constructor<?>[] constructors = c.getConstructors();
//		for(Constructor<?> con:constructors) {
//			System.out.println(con);
//		}
		
//		returns the fields defined in the class
//		Field[] declaredFields = c.getDeclaredFields();
//		for(Field f:declaredFields) {
//			System.out.println(f.getName());
//		}
		
//		returns all the methods declared in the class
		Method[] declaredMethods = c.getDeclaredMethods();
		for(Method m:declaredMethods) {
			System.out.println(m.getName());
		}
	}
}
