import java.util.*;
public class week2 {
    public static void main(String[] args) {
        int[] dataNilai = {90,85,75,92,93,84};
        double hasilavg = mean(dataNilai);
        int nilaimax = max(dataNilai);
        int nilaimin = min(dataNilai);
        
        System.out.println("Rata-rata: "+hasilavg);
        System.out.println("Nilai Maksimal: "+nilaimax);
        System.out.println("Nilai Minimal: "+nilaimin);
        
    }
    
    public static int max (int[] dataNilai){
        int max;
        max = dataNilai[0];
        
        for(int i = 0; i < dataNilai.length; i++){
            if(dataNilai[i]>max){
                max = dataNilai[i];
            }
        }
        return max;
    }
    public static int min (int[] dataNilai){
        int min;
        min = dataNilai[0];
        
        for(int i=0; i<dataNilai.length; i++){
            if(dataNilai[i]<min){
                min = dataNilai[i];
            }
        }
        return min;
    }
    public static double mean(int[] dataNilai){
        double total = 0.0;
        double avg;
        
        for(int i=0; i<dataNilai.length;i++){
            total += dataNilai[i];
        }
        avg = total/dataNilai.length;
        return avg;
        
    }
    
}

