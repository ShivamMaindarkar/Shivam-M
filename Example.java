public class Example {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.run(); 
        Animal.sleep(); 
    }
}

interface Animal {
    void walk(); 
    void eat();  

    
    static void sleep() {
        System.out.println("Animal is sleeping.");
    }

    
    default void run() {
        System.out.println("This is a default method in the interface.");
    }
}

class Dog implements Animal {
    public void walk() {
        System.out.println("Dog is walking.");
    }
    public void eat() {
        System.out.println("Dog is eating.");
    }
}