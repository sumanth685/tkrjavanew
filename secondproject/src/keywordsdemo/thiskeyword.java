package keywordsdemo;


	class Example{
		int a = 10;
		public void show() {
			int a = 30;
			System.out.println("a = "+a);
			System.out.println("a = "+this.a);
		}
	}

	public class thiskeyword {

		public static void main(String[] args) {
			Example E=new Example();
			E.show();
			}
	}


