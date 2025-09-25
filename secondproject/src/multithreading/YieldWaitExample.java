package multithreading;


	class Shared {
	    synchronized void waitMethod() {
	        System.out.println(Thread.currentThread().getName() + " is going to wait...");
	        try {
	            wait(); // releases lock and waits
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        System.out.println(Thread.currentThread().getName() + " resumed after notify!");
	    }

	    synchronized void notifyMethod() {
	        System.out.println(Thread.currentThread().getName() + " is notifying...");
	        notify(); // wakes up one waiting thread
	    }
	}

	public class YieldWaitExample {
	    public static void main(String[] args) {
	        // ---- yield() demo ----
	        Thread t1 = new Thread(() -> {
	            for (int i = 1; i <= 3; i++) {
	                System.out.println("Thread-1: " + i);
	                if (i == 2) {
	                    System.out.println("Thread-1 yielding...");
	                    Thread.yield();
	                }
	            }
	        });

	        Thread t2 = new Thread(() -> {
	            for (int i = 1; i <= 3; i++) {
	                System.out.println("Thread-2: " + i);
	            }
	        });

	        t1.start();
	        t2.start();

	        // ---- wait() and notify() demo ----
	        Shared resource = new Shared();

	        Thread waiter = new Thread(() -> resource.waitMethod(), "Waiter");
	        Thread notifier = new Thread(() -> {
	            try {
	                Thread.sleep(1000); // ensure waiter runs first
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	            resource.notifyMethod();
	        }, "Notifier");

	        waiter.start();
	        notifier.start();
	    }
	}



