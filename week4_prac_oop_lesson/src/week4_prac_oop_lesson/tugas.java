package week4_prac_oop_lesson;

public class tugas {
    private String tittle;
    private String author;
    private int stock;
    private int price;

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTittle() {
        return tittle;
    }

    public String getAuthor() {
        return author;
    }

    public int getStock() {
        return stock;
    }

    public int getPrice() {
        return price;
    }
    
    public int getTotal(){
        return price*stock;
    }
    
    public static void main(String args[]) {
        tugas ob = new tugas();
        
        ob.setAuthor("Muktibaskara");
        ob.setTittle("Bulan di Langit Antartika");
        ob.setStock(2);
        ob.setPrice(65000);
        
        System.out.println("=====Input Pembelian Buku=====");
        System.out.println("Judul Buku\t: "+ob.getTittle());
        System.out.println("Penulis\t\t: "+ob.getAuthor());
        System.out.println("Jumlah Beli\t: "+ob.getStock());
        System.out.println("Harga Buku(Rp)\t: "+ob.getPrice());
        
        System.out.println("=====Data Pembelian=====");
        System.out.println("Judul Buku\t: "+ob.getTittle());
        System.out.println("Penulis\t\t: "+ob.getAuthor());
        System.out.println("Jumlah Beli\t: "+ob.getStock());
        System.out.println("Harga Buku(Rp)\t: "+ob.getPrice());
        
        System.out.println("=====Total Pembayaran=====");
        System.out.println("Total (Rp)\t: "+ob.getTotal());
        
    }
}
