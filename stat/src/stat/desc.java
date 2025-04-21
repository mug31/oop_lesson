package stat;

import tools.tools;

public class desc {
    private int[] data;
    private double mean = 0.0;
    private double total = 0.0;
    private double median;
    private int modus;

    public desc(int[] d) {
        data = d;
    }

    public void setData(int[] d) {
        data = d;
    }

    public int[] getData() {
        return data;
    }

    public void setMedian() {
        tools.setData(getData());
        tools.sorting();

        if (data.length % 2 == 0) {
            median = (data[data.length / 2 - 1] + data[data.length / 2]) / 2;
        } else {
            median = data[data.length / 2];
        }
    }
    
    public double getMedian() {
        return median;
    }
    
    public void setModus() {
        int maxFrekuensi = 0;
        int hasil = data[0];

        for (int i = 0; i < data.length; i++) {
            int frekuensi = 0;
            for (int j = 0; j < data.length; j++) {
                if (data[i] == data[j]) {
                    frekuensi++;
                }
            }
            if (frekuensi > maxFrekuensi) {
                maxFrekuensi = frekuensi;
                hasil = data[i];
            }
        }

        modus = hasil;
    }

    public int getModus() {
        return modus;
    }
    
    public void print() {
        setMedian();
        setModus();
        System.out.println("Median = " + getMedian());
        System.out.println("Modus = " + getModus());
    }
}
