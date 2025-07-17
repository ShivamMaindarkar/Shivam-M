class ParmiterCon{
    int x;
    public ParmiterCon(int y){
        x = y;
    }
    public static void main(String[] args) {
        ParmiterCon pc = new ParmiterCon(10);
        System.out.println(pc.x);
    }
}
