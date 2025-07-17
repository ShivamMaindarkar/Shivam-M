interface Animal {
    public void walk();
    public void eat();
}
class dog implements Animal{
    public void walk(){
        System.out.println("Child class");
    }
    public void eat(){
        System.out.println("Child class");
    }
}
public class Exampleinterface {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.eat();
        d1.walk();
    }
}

