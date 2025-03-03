package week2;
public class Week2{
    int[] data = {5,10,15,20,30};
    int tes;
    
    
    
    public void line(){
        Week2 obj = new Week2();
        for(int i=0; i<obj.data.length -1 ; i++){
            System.out.print(obj.data[i]+" ");
        }
        
    }
    
    public static void main(String[] args) {
    Week2 ob = new Week2();
    ob.line();
    
    }
}