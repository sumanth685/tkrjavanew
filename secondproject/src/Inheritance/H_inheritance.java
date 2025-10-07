package Inheritance;



	class Animal {
	    void eat() {
	        System.out.println("I can eat.");
	    }
	}

	class Dog extends Animal {
	    void bark() {
	        System.out.println("I can bark.");
	    }
	}

	class Cat extends Animal {
	    void meow() {
	        System.out.println("I can meow.");
	    }
	}

	public class H_inheritance {
	    public static void main(String[] args) {
	        Dog d = new Dog();
	        Cat c = new Cat();
	        d.eat(); d.bark();
	        c.eat(); c.meow();
	    }
	}


	