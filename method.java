class method {
    int add(){
        int a = 10;
        int b = 30;
        int sum = a+b;
        return sum;
    }
    method(){
        System.out.println("this is constructor");
    }
    public static void main(String[] args){
        method m = new method();
        int sum = m.add();
        System.out.print(sum);

    }
}
