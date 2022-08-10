package JavaProjects2;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateSupplierConsumerEx {
	public static void main(String[] args) {
		Predicate<Integer> p= i-> i%2==0;
		System.out.println(p.test(10));
		System.out.println(p.test(7));
		
		//Function
		Function <Integer,Integer> f=i->i*i;
		System.out.println(f.apply(4));
		System.out.println(f.apply(14));
		
		Function <String,Integer> f1=s->s.length();
		System.out.println(f1.apply("twinkle"));
		System.out.println(f1.apply("shreya"));
		
		Function<String,String>f2= s->s.toUpperCase();
		System.out.println(f2.apply("Urvigugu"));
	}

}
