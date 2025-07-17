abstract class Cat{
    abstract void run();
    abstract void fly();
    Cat(){
        System.out.println("this is constructor");
    }
}
class Demo extends Cat{
    public void run(){
        System.out.println("this method is for run");
    }
    public void fly(){
        System.out.println("this method is for fly");
    }
    Demo(){
        System.out.println("this is child class constructor");
    }
}
class Cons{
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.run();
        d1.fly();
    }
}