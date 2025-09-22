package interfaces;

public interface child {
	void display();  // Additional abstract method

    // Static method to produce output
    static void showChildMessage() {
        System.out.println("Hello from Child Interface!");
    }

}
