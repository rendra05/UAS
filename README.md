# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengelolaan data buku perpustakaan menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa data buku seperti ISBN, judul, penulis, serta tambahan atribut berupa ukuran file jika tipe buku adalah eBook. Program akan menampilkan daftar buku yang telah dimasukkan, serta memberikan penanda khusus untuk buku yang memiliki judul mengandung kata "java".

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `KoleksiBuku`, `Ebook`, dan `PerpustakaanApp` adalah contoh dari class.

```bash
public class KoleksiBuku {
    ...
}

public class Ebook extends KoleksiBuku {
    ...
}

public class PerpustakaanApp {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `koleksi[i] = new KoleksiBuku(...)` atau `new Ebook(...)` adalah contoh pembuatan object.

```bash
koleksi[i] = new Ebook(isbn, judul, penulis, ukuranFile);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `isbn`, `judul`, `penulis`, dan `ukuranFileMB` adalah contoh atribut.

```bash
String isbn;
String judul;
String penulis;
double ukuranFileMB;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor terdapat di class `KoleksiBuku` dan `Ebook`.

```bash
public KoleksiBuku(String isbn, String judul, String penulis) {
    this.isbn = isbn;
    this.judul = judul;
    this.penulis = penulis;
}

public Ebook(String isbn, String judul, String penulis, double ukuranFileMB) {
    super(isbn, judul, penulis);
    this.ukuranFileMB = ukuranFileMB;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai atribut.

```bash
public void setPenulis(String penulis) {
    this.penulis = penulis;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai atribut.

```bash
public String getJudul() {
    return judul;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan menjadikan atribut `private` dan hanya bisa diakses melalui method.

```bash
private String isbn;
private double ukuranFileMB;
```

8. **Inheritance** adalah pewarisan properti dan method dari class lain. Pada kode ini, `Ebook` mewarisi class `KoleksiBuku`.

```bash
public class Ebook extends KoleksiBuku {
    ...
}
```

9. **Polymorphism** dalam bentuk Overriding, method `tampilkan()` di `Ebook` menimpa method yang sama di `KoleksiBuku`.

```bash
@Override
public void tampilkan() {
    ...
}
```

10. **Seleksi** digunakan untuk pengambilan keputusan, misalnya mengecek apakah judul buku mengandung kata "java".

```bash
if (buku.getJudul().toLowerCase().contains("java")) {
    System.out.println(">> Buku ini berkaitan dengan pemrograman.");
}
```

11. **Perulangan** digunakan untuk mengulang proses input.

```bash
while (jumlah < koleksi.length) {
    ...
}
```

12. **Input Output Sederhana** menggunakan `Scanner` untuk input dan `System.out.println` untuk output.

```bash
Scanner input = new Scanner(System.in);
System.out.print("Masukkan Judul Buku: ");
judul = input.nextLine();
```

13. **Array** digunakan untuk menyimpan kumpulan objek buku.

```bash
KoleksiBuku[] koleksi = new KoleksiBuku[4];
```

14. **Error Handling** digunakan untuk menangani input yang tidak valid.

```bash
try {
    ukuranFile = Double.parseDouble(input.nextLine());
} catch (NumberFormatException e) {
    System.out.println("Input tidak valid untuk ukuran file.");
}
```

## Usulan nilai

|  No | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |    10   |
|  10 | Seleksi        |    5    |
|  11 | Perulangan     |    5    |
|  12 | IO Sederhana   |    10   |
|  13 | Array          |    15   |
|  14 | Error Handling |    15   |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Azril Nazar Pasha Andhika
NPM: 2310010346
