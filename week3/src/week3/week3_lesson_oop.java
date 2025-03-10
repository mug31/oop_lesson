package week3;
public class week3_lesson_oop {
    int[] data ={30,20,90,70,50};
    
    public void look(int[] data,int target){
        for(int i = 0; i<data.length;i++){
            if(data[i]==target){
                System.out.println("Target berada di:"+i);
            }
        }
    }
    public static int lookR(int[]data, int target){
        int hasil = 0;
        
        for(int i = 0; i<data.length;i++){
            if(data[i]==target){
                System.out.println("target berada di: "+ i);
            }
        }
        return hasil;
    }
    public static void main(String[] args) {
        week3_lesson_oop ob = new week3_lesson_oop();
        int target = 70;
        
        lookR(ob.data,target);
        ob.look(ob.data, target);
    }
    
}
