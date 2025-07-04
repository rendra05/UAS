package Perpus;

import java.util.Scanner;

public class PerpustakaanApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KoleksiBuku[] koleksi = new KoleksiBuku[4];
        int jumlah = 0;

        System.out.println("=== INPUT DATA KOLEKSI BUKU ===");
        while (jumlah < koleksi.length) {
            try {
                System.out.print("\nMasukkan ISBN: ");
                String isbn = sc.nextLine();

                System.out.print("Masukkan Judul Buku: ");
                String judul = sc.nextLine();

                System.out.print("Masukkan Penulis: ");
                String penulis = sc.nextLine();

                System.out.print("Tipe Buku (1 = Fisik, 2 = eBook): ");
                int tipe = Integer.parseInt(sc.nextLine());

                if (tipe == 1) {
                    koleksi[jumlah] = new KoleksiBuku(isbn, judul, penulis);
                } else if (tipe == 2) {
                    System.out.print("Ukuran File (MB): ");
                    double ukuran = Double.parseDouble(sc.nextLine());
                    koleksi[jumlah] = new Ebook(isbn, judul, penulis, ukuran);
                } else {
                    System.out.println("Tipe tidak valid. Ulangi input.");
                    continue;
                }

                jumlah++;
            } catch (NumberFormatException e) {
                System.out.println("Input angka tidak valid. Ulangi.");
            }
        }

        // Menampilkan koleksi
        System.out.println("\n=== DAFTAR BUKU DALAM PERPUSTAKAAN ===");
        for (KoleksiBuku buku : koleksi) {
            buku.tampilkan();

            if (buku.getJudul().toLowerCase().contains("java")) {
                System.out.println(">> Buku ini berkaitan dengan pemrograman.");
            }

            System.out.println("-----------------------------");
        }

        sc.close();
    }
}
