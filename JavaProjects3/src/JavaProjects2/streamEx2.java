package JavaProjects2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamEx2 {
public static void main(String[] args) {
	
	//for creating blank stream object 
	//Stream<Object> empty1 = Stream.empty();
	//empty1.forEach(e->{System.out.println(e);});  //it won't print anything.
	
	
	String names[]= {"Neha","Ruhi","chinki"};
	Stream<String> stream1= Stream.of(names);
	stream1.forEach(e->{System.out.println(e);});
	
	//filter(Predicate) which takes boolean value.
	
	List<String> list1= List.of("chinki","chandini","chhavi","Priya");
	List<String> listvalue = list1.stream().filter(e->e.startsWith("c")).collect(Collectors.toList());
	System.out.println(listvalue);
	
   //map(Function) which takes some input and perform some operations and return the result
	
	List<Integer> value=List.of(12,2,3,4,5,6,4,5,3,2);
	List<Integer> valueis = value.stream().map(i->i*i).collect(Collectors.toList());
	System.out.println(valueis);
	
	//foreach(Consumer) accept same input and perform required operation and not required to retuntype.
	
	list1.stream().forEach(e->System.out.println(e));
	
	//sorting element
	
	value.stream().sorted().forEach(System.out::println);
	
	// to display the min value from the list
	Integer number = value.stream().min((x,y)->x.compareTo(y)).get();
	System.out.println(number);
	
	//to display the max value from the list
	Integer num = value.stream().max((x,y)->x.compareTo(y)).get();
	System.out.println(num);
	
	// to display unique value
	List<Integer> collect = value.stream().distinct().collect(Collectors.toList());
	System.out.println(collect);
	}
}
