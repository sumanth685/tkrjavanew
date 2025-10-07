package multithreading;



	class MyRunnable implements Runnable {
	 public void run() {
	     for (int i = 1; i <= 3; i++)
	         System.out.println("Running by: " + Thread.currentThread().getName());
	 }
	}

	public class RunnableDemo {
	 public static void main(String[] args) {
	     Thread t1 = new Thread(new MyRunnable());
	     Thread t2 = new Thread(new MyRunnable());
	     t1.start();
	     t2.start();
	 }
	}
	