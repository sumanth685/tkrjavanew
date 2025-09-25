package multithreading;

public class CurrentThread {
	
	    public static void main(String[] args) {
	        // Get reference to the main thread
	        Thread t = Thread.currentThread();

	        // Print current thread details
	        System.out.println("Current Thread: " + t);
	        System.out.println("Thread Name   : " + t.getName());
	        System.out.println("Thread Priority: " + t.getPriority());
	        System.out.println("Is Alive?     : " + t.isAlive());

	        // Change thread name and priority
	        t.setName("MyMainThread");
	        t.setPriority(Thread.MAX_PRIORITY);

	        System.out.println("\nAfter changes:");
	        System.out.println("Thread Name   : " + t.getName());
	        System.out.println("Thread Priority: " + t.getPriority());

	        // Run a loop to see it in action
	        for (int i = 1; i <= 5; i++) {
	            System.out.println("Iteration: " + i + " running in " + Thread.currentThread().getName());
	            try {
	                Thread.sleep(500); // pause for half second
	            } catch (InterruptedException e) {
	                System.out.println("Thread interrupted!");
	            }
	        }
	    }
	}



