package practicum_polimorfism;

class Komputer {

    public void tampil() {
        System.out.println("Ini Komputer...");
    }
}

class Laptop extends Komputer {

    public void tampil() {
        System.out.println("Ini Laptop...");
    }
}

class PC extends Komputer {

    public void tampil() {
        System.out.println("Ini PC...");
    }
}

class polymorfisme {

    public static void main(String[] args) {
        Laptop lp = new Laptop();
        lp.tampil();
        PC pc = new PC();
        pc.tampil();
    }
}
