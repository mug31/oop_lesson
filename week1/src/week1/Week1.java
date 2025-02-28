package week1;
public class Week1 {

   int[] data = {5,10,15,20,30};
   
    public static void main(String[] args) {
         Week1 obj = new Week1();
        for(int i=0; i<obj.data.length -1 ; i++){
            System.out.print(obj.data[i]+" ");
        }
        System.out.println();
    }
}
