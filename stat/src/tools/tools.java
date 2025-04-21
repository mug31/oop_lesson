package tools;

public class tools {
    private static int[] data = {10, 20, 30};
    private int hasil = -1;

    public tools(int[] d) {
        data = d;
    }

    public static void setData(int[] d) {
        data = d;
    }

    public int[] getData() {
        return data;
    }

    public static void sorting() {
        int f = -1;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (data[j] > data[j + 1]) {
                    f = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = f;
                }
            }
        }
    }
}
