import java.util.Scanner;
class Demo{
    public void fun(){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    try{
        int c = a/b;
        int arr[] = new int[6];
        arr[10] = 20;
        System.out.println("this is output"+ c);
    }catch(ArithmeticException e){
        System.out.println(e.getMessage());
    }
}
}
public class Examples{
    public static void main(String[] args) {
        Demo d = new Demo();
        d.fun(); 
    }
}
