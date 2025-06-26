/*import java.util.Scanner;

class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
    }
}*/

class demo{
    int add (){
        int a = 10;
        int b = 90;
        int sum = a+b;
        return sum;
    }
}
class Hello {
    public static void main(String[] args) {
        demo d = new demo();
        System.out.println(d.add());
    }

    
}