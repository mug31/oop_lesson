package week2;
public class Week2{
    int[] data = {5,10,15,20,30};
    
    int tes;
    Week2(){
        this.tes=0;
    }
    Week2(int tes){
        this.tes=tes;
    }
    public void prin(){
        System.out.println();
        System.out.print("Testing :" + tes);
    }
    
    
    public void line(){
        Week2 obj = new Week2();
        for(int i=0; i<obj.data.length -1 ; i++){
            System.out.print(obj.data[i]+" ");
        }
        
    }
    
    public static void main(String[] args) {
    Week2 ob = new Week2();
    Week2 ob2 = new Week2(500);
    ob.line();
    ob2.prin();
    
    }
}