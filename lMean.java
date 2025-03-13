package baskara.cihuy;
import java.util.*;
public class lMean {
    int[] dataNilai ;
    
    lMean(int[]dataNilai){
        this.dataNilai=dataNilai;
    }
    
    
    int max (){
        int max;
        max = dataNilai[0];
        
        for(int i = 0; i < dataNilai.length; i++){
            if(dataNilai[i]>max){
                max = dataNilai[i];
            }
        }
        return max;
    }
    int min (){
        int min;
        min = dataNilai[0];
        
        for(int i=0; i<dataNilai.length; i++){
            if(dataNilai[i]<min){
                min = dataNilai[i];
            }
        }
        return min;
    }
    double mean(){
        double total = 0.0;
        double avg;
        
        for(int i=0; i<dataNilai.length;i++){
            total += dataNilai[i];
        }
        avg = total/dataNilai.length;
        return avg;
        
    }
    public static void main(String[] args) {
        
        int[] Nilai = {90,85,75,92,93,84};
        lMean ob = new lMean(Nilai);
        
        System.out.println("Nilai Max: "+ob.max());
        System.out.println("Nilai Min: "+ob.min());
        System.out.println("Nilai Rata-rata: "+ob.mean());
        
    }
    
}


