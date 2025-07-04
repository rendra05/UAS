package Perpus;

public class Ebook extends KoleksiBuku {
    private double ukuranFileMB;

    public Ebook(String isbn, String judul, String penulis, double ukuranFileMB) {
        super(isbn, judul, penulis);
        this.ukuranFileMB = ukuranFileMB;
    }

    public double getUkuranFileMB() {
        return ukuranFileMB;
    }

    public void setUkuranFileMB(double ukuranFileMB) {
        this.ukuranFileMB = ukuranFileMB;
    }

    @Override
    public void tampilkan() {
        super.tampilkan();
        System.out.println("Tipe    : eBook");
        System.out.println("Ukuran  : " + ukuranFileMB + " MB");
    }
}
