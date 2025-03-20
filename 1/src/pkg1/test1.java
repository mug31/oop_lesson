package pkg1;

public class test1 {

    public double a;
    private double b;
    public double c;
    
    public test1(int x, int y){
        a = x;
        b = y;
    }
    
    public void getPhytagoras(){
        c = Math.sqrt(a*a+b*b);
    }
    
    public double getPhytagoras(double x, double y){
        a = x;
        b = y;
        c = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
        return c;
        
    }
    public double getPhytagoras(double y){
        b = y;
        c = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
        return c;
    }
    public void cetak(){
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        getPhytagoras();
        System.out.println("c = "+c);
    }
    
    
}
class app{
    public static void main(String[] args) {
        test1 obj = new test1(3,4);
        
        obj.cetak();
        System.out.println(obj.getPhytagoras(7, 5));
        
        obj.cetak();
        System.out.println(obj.a);
        System.out.println();
        
        obj.getPhytagoras(10);
        obj.cetak();
    }
}
