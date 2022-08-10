package JavaProjects2;

interface I{
	default void m1() {
		System.out.println("this is the default method class");
	}
}
interface I2 {
	default void m1() {
		System.out.println("this is overriding method m1");
	}
}
	interface I3 {
		default void m1() {
			System.out.println("hii there!!");
			
		}	
}
	

public class DefaultInterfaceEx implements I,I2,I3{
	public void m1() {
		//System.out.println("here is overriden method of class");
		I3.super.m1();
		I2.super.m1();
		I.super.m1();
		
	}
	

	public static void main(String[] args) {
		
		DefaultInterfaceEx AI=new DefaultInterfaceEx();
		AI.m1();
	}
}

