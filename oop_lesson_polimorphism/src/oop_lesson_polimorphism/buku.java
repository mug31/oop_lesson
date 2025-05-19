package oop_lesson_polimorphism;



public class buku extends LibraryCollection{
    private String kodeKoleksi;
    private String judulBuku;
    private String penulis;
    private String penerbit;
    private String tahunTerbit;
    
    buku(){
    }
    
    buku(String k, String n, String a, String p, String y){
        kodeKoleksi = k;
        judulBuku = n;
        penulis = a;
        penerbit = p;
        tahunTerbit = y;
    }

    public String getKodeKoleksi() {
        return kodeKoleksi;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public String getPenulis() {
        return penulis;
    }
     
    public void setPenulis(String a){
        penulis = a;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }
    
    public void printCollection(){
        System.out.println("Kode koleksi:"+kodeKoleksi);
        System.out.println("Judul Buku:"+judulBuku);
        System.out.println("Penulis:"+penulis);
        System.out.println("Penerbit:"+penerbit);
        System.out.println("Tahun Terbit:"+tahunTerbit);
    }
}