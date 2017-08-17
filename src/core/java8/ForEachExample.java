package core.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * forEach method takes java.util.function.Consumer object as argument, having
 * our business logic at a separate location for reusable purpose
 *
 */
public class ForEachExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		//using iterator to 
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {			
			System.out.println("Iterator value:" + it.next());
		}
		
		System.out.println("======================================");
		//using forEach method with anonymous class		
		list.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.printf("forEach anonymous class val: %d \n", t);
			}
		});
		
		System.out.println("======================================");
		//using Consumer Interface implementation
		IntegerConsumer consumer = new IntegerConsumer();
		list.forEach(consumer);
	}
	//forEach method implementation
	//default only allow in interface
	/*
		default void forEach(Consumer<? super T> action) {
			Objects.requireNonNull(action);
			for (T t : this) {
				action.accept(t);
			}
		}
	*/
}

class IntegerConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer t) { 
		System.out.printf("forEach using Consumer implement val: %d \n", t);
	}	
}
