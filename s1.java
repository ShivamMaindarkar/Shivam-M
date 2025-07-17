class hello {
    public static void main(String[] args) {
        hello h = new hello(); 
        h.add();               

        int a = 10;
        int b = 30;
        int add = a + b;
        System.out.println(add);
    }

    void add() {
        System.out.println("This is the add() method."); 
    }
}
