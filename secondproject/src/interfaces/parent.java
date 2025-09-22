package interfaces;

public interface parent {
	void greet();  // Abstract method

    // Static method to produce output
    static void showMessage() {
        System.out.println("Hello from Parent Interface!");
    }

}
