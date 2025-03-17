package week4;

public class lesson_oop_w4 {
    double x = 4;
    double y = 3;
    int cons = 0;
    
    lesson_oop_w4(int cons){
        this.cons = cons;
    }
    
    double getPhytagoras(){
       double total = 0;
       total = Math.sqrt((x * x) + (y * y));
       return total;
    }
    void getPhytagorasA(){
        double total = 0;
        total = Math.sqrt((x * x) + (y * y));
        System.out.println("garis : "+total);
    }
    public static void main(String args[]) {
        lesson_oop_w4 b = new lesson_oop_w4(0);
        
        System.out.println(" garis miring: "+b.getPhytagoras());
        b.getPhytagorasA();
    }
}
