public class Dosen10 {
    String kode;
    String nama;
    boolean jeniskelamin;
    int usia;

    Dosen10 (String kd, String name, Boolean jk, int age) {
        kode = kd;
        nama = name; 
        jeniskelamin = jk;
        usia = age;
    }

    void tampil () {
        System.out.println("Kode : " +kode);
        System.out.println("Nama : " +nama);
        System.out.println("Jenis Kelamin : " + (jeniskelamin ? "pria" : "wanita"));
        System.out.println("Usia : " +usia);
    }
}
