package practicum_polimorfism;
class Hitung {

    static int Perkalian(int a, int b) {
        return a * b;
    }

    static double Perkalian(double a, double b) {
        return a * b;
    }
}

class polymorfOverload {

    public static void main(String[] args) {
        System.out.println(Hitung.Perkalian(2, 4));
        System.out.println(Hitung.Perkalian(2.5, 2));
    }
}
