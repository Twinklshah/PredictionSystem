package JavaProjects2;

import java.util.Arrays;
import java.util.List;
//import java.util.function.Consumer;

public class ConsumerEx {

	
	/*public void accept(Object t) {
		System.out.println(t);
		// TODO Auto-generated method stub
		
	}*/
	public static void main(String[] args) {
		/*Consumer<String> Cs=new ConsumerEx();
		Cs.accept("Twinkle");*/
	
	
	List<Integer> list1=Arrays.asList(1,3,4,5,6,7,8,10);
	list1.forEach((t) -> System.out.println(t));
	
}
}
