import java.util.*;

public class stastik {
    private int[] dataNilai ;
    private int max;
    private int min;
    private double mean;
    private double median;

    public stastik(int[]dataNilai){
        this.dataNilai=dataNilai;
    }
    public int[] getDataNilai() {
        return dataNilai;
    }

    public void setDataNilai(int[] dataNilai) {
        this.dataNilai = dataNilai;
    }

    public int getMax() {
        max = dataNilai[0];
        for(int i = 0; i < dataNilai.length; i++){
            if(dataNilai[i]>max){
                max = dataNilai[i];
            }
        }
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        min = dataNilai[0];
        for(int i=0; i<dataNilai.length; i++){
            if(dataNilai[i]<min){
                min = dataNilai[i];
            }
        }
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public double getMean() {
        double total = 0.0;
        for(int i=0; i<dataNilai.length;i++){
            total += dataNilai[i];
        }
        return total/dataNilai.length;
    }

    public void setMean(double mean) {
        this.mean = mean;
    }
    public double getMedian() {
        Arrays.sort(dataNilai);
        int n = dataNilai.length;
        if(n%2==0){
            median = (dataNilai[n/2-1]+ dataNilai[n/2]) / 2.0;
        }
        return median;
    }

    public void setMedian(double median) {
        this.median = median;
    }
    
    public void print() {
        System.out.println("Nilai Max: "+getMax());
        System.out.println("Nilai Min: "+getMin());
        System.out.println("Nilai Rata-rata: "+getMean());
        System.out.println("Nilai Tengah: "+getMedian());
        
    }
    
    public static void main(String[] args) {
        int[] Nilai = {90,85,75,92,93,84};
        stastik ob = new stastik(Nilai);
        ob.print();        
    }
}