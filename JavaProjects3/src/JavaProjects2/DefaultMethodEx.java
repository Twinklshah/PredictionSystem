package JavaProjects2;

interface I1{
	public void method1();
	public void method2();
//  public void method3(); it will effect the implementation class if we didn't create the body of this method in classes.
	                      // to overcome this problem default method is used 
	default void method3() {
		System.out.println("Hello there meet the default class");
	}
}  // note: without effecting implementation class if we want to add new method to interfaces==> default method.

 class Base implements I1{
	 public void method1() {System.out.println("hello i am implementation method");}
	 public void method2() {}
	
}
 class Base2 implements I1{
	 public void method1() {}
	 public void method2() {}
	 
 }
public class DefaultMethodEx {
	public static void main(String[] args) {
		Base B=new Base();
		B.method1();
		B.method2();
		B.method3();
		
		
	}

}
