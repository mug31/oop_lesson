import java.util.Arrays;

public class Statistik {
    private int[] data;

    public Statistik(int[] data) {
        this.data = data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }

    public int getMax() {
        int max = data[0];
        for (int val : data) {
            if (val > max) max = val;
        }   
        return max;
    }

    public int getMin() {
        int min = data[0];
        for (int val : data) {
            if (val < min) min = val;
        }
        return min;
    }

    public double getMean() {
        double sum = 0;
        for (int val : data) sum += val;
        return sum / data.length;
    }

    public double getMedian() {
        int[] copy = Arrays.copyOf(data, data.length); // supaya data asli gak berubah
        Arrays.sort(copy);
        int n = copy.length;
        return (n % 2 == 0) ? 
            (copy[n / 2 - 1] + copy[n / 2]) / 2.0 : 
            copy[n / 2];
    }

    public void printStats() {
        System.out.printf("""
            Max    : %d
            Min    : %d
            Mean   : %.2f
            Median : %.2f
            """, getMax(), getMin(), getMean(), getMedian());
    }

    public static void main(String[] args) {
        int[] nilai = {90, 85, 75, 92, 93, 84};
        Statistik stats = new Statistik(nilai);
        stats.printStats();
    }
}
