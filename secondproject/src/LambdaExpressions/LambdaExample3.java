package LambdaExpressions;

	public class LambdaExample3 {
	    public static void main(String[] args) {
	        Calculator add = (a, b) -> a + b;
	        Calculator multiply = (a, b) -> a * b;

	        System.out.println("Addition: " + add.operate(10, 5));
	        System.out.println("Multiplication: " + multiply.operate(10, 5));
	    }
	}

	