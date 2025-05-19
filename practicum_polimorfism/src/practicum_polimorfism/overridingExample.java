package practicum_polimorfism;

abstract class Hewan {
    protected abstract void munculSuara();
}

class Kucing extends Hewan {

    @Override
    protected void munculSuara() {
        System.out.println("Suara Kucing: AUK AUK AUK GUK");
    }
}

class Burung extends Hewan {

    @Override
    protected void munculSuara() {
        System.out.println("Suara Burung: ciricit ciricit");
    }
}
 class polymorfOveride {

    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        kucing.munculSuara();
        Hewan burung = new Burung();
        burung.munculSuara();
    
}
}
