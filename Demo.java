class Plane {
    public void fly(){
        System.out.println("the plane is fly");
}
   
}
class CargoPlane extends Plane{
    public void fly(){
        System.out.println("CargoPlane is fly at low level");
    }
}
class PassengerPlane extends Plane{
    public void fly(){
        super.fly();
        System.out.println("CargoPlane is fly at high level ");
    }
}
class FighterPlane extends Plane{
    public void fly(){
        System.out.println("CargoPlane is fly at great level");
    }
}
public class Demo{
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();

        //cp.fly();
        //pp.fly();
        //fp.fly();
        Plane ref;
        ref = cp;
        ref.fly();
        ref = pp;
        ref.fly();
        ref = fp;
        ref.fly();
    }
}
