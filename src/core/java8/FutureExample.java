package core.java8;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Future in programming language is also known as 'promise or delay' Future is
 * a proxy or wrapper around an object that will be available once the
 * asynchronous computation is done
 * 
 * Future.get() : blocks and waits until promised result is available (resolved)
 *  Future.isDone() : check if the result available
 *  
 * CompletableFuture (jse 8) (implements CompletionStage) is a promise. It
 * promises that the computation eventually will be done.
 * CompletableFuture allows you to string tasks together in a chain
 */
public class FutureExample {
	private final ExecutorService pool = Executors.newFixedThreadPool(10);
	int count = 1;
	
	public Future<Integer> startProcess() {
		return pool.submit(new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				Thread.sleep(5000); //sleep 5 seconds
				return ++count;
			}
		});
	}
	
	public void startProcess_2() throws InterruptedException, ExecutionException {
		/**
		 * CompletableFuture
		 */
		CompletableFuture<Integer> f = CompletableFuture.supplyAsync(new MySupplier(), pool);
		
		System.out.println(f.isDone()); // False
		CompletableFuture<Integer> f2 = f.thenApply(new AddFunction());
		System.out.println(f2.get()); // Waits until the "calculation" is done then prints 3
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		FutureExample f = new FutureExample();
		
		Future<Integer> future = f.startProcess();
		System.out.println(future.isDone()); //it should return false
		System.out.println(future.get()); // waits till the task completed and return 2
		
		System.out.println("==============CompletableFuture=================");
		
		f.startProcess_2();
	}
	
	public static class MySupplier implements Supplier<Integer> {
		
		@Override
		public Integer get() {
			try {
				Thread.sleep(3000); //sleep 3 seconds
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
			return 2;
		}		
	}
	
	public static class AddFunction implements Function<Integer, Integer> {

		@Override
		public Integer apply(Integer t) {			
			return t + 1;
		}		
	}
}

