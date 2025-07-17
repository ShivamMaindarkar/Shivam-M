class person{
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String nm){
        this.name = nm;
    }
}
public class Encapsulation{
    public static void main(String[] args){
        person p = new person();
        p.setName("mangesh");
        String s = p.getName();
        System.out.println(p.getName());

    }
}