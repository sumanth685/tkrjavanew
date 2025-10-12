package StreamApi;
import java.util.stream.IntStream;





	
public class ParallelOrderProcessing{
	 
	    public static void main(String[] args) {
	        IntStream.range(1, 10)
	                .parallel()
	                .forEach(n -> System.out.println(Thread.currentThread().getName() + " : " + n));
	    }
	}


	