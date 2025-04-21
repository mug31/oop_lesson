
import stat.desc;
public class app {
    private static int[] d = {20, 10, 50, 40};

    public static void main(String args[]) {
        desc des = new desc(d);

        int[] dat = {10, 20, 30, 20, 50, 20, 10};
        des.setData(dat);
        des.print();
    }
}
