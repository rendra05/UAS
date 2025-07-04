package Perpus;

public class KoleksiBuku {
    private String isbn;
    private String judul;
    private String penulis;

    public KoleksiBuku(String isbn, String judul, String penulis) {
        this.isbn = isbn;
        this.judul = judul;
        this.penulis = penulis;
    }

    // Accessor
    public String getIsbn() {
        return isbn;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    // Mutator
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void tampilkan() {
        System.out.println("ISBN    : " + isbn);
        System.out.println("Judul   : " + judul);
        System.out.println("Penulis : " + penulis);
    }
}
