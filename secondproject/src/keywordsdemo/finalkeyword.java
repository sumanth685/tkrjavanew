package keywordsdemo;


	final class Vehicle{
		// final variable (constant value)
		final int speedLimit = 100;

	    // final method (cannot be overridden)
		final void show() {
	     System.out.println("Speed Limit is: " + speedLimit + " km/h");
		}
	}
	public class finalkeyword {

		public static void main(String[] args) {
			Vehicle V = new Vehicle();
		     V.show();

		}

	}


