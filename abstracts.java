abstract class Animal {
    abstract void walk();
    void eat(){
        System.out.println("Animal can eat");
    }
}
class Dog extends Animal{
    public void walk(){
        System.out.println("my extended method");

    }
}
public class abstracts{
    public static void main(String[] args){
        Dog d = new Dog();
        d.walk();
        d.eat();
    }
}
