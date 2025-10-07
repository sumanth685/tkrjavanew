package multithreading;



	class MyThread extends Thread {
	 public void run() {
	     for (int i = 1; i <= 3; i++)
	         System.out.println("Running thread: " + Thread.currentThread().getName());
	 }
	}

	public class ThreadDemo {
	 public static void main(String[] args) {
	     MyThread t1 = new MyThread();
	     MyThread t2 = new MyThread();
	     t1.start();
	     t2.start();
	 }
	}


	