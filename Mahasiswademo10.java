import java.util.Scanner;
public class Mahasiswademo10 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa yang ingin anda input : ");
        int jumlahmhs = sc.nextInt();
        sc.nextLine();
        MahasiswaBeprestasi10 list = new MahasiswaBeprestasi10(jumlahmhs);

        for (int i = 0; i < jumlahmhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            System.out.println("--------------------");

            Mahasiswa10 m = new Mahasiswa10(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        list.tampil();
        //melakukan pencarian data binary
        System.out.println("----------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("----------------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari : ");
        System.out.print("IPK : ");
        double cari = sc.nextDouble();
        System.out.println("----------------------------------------");
        System.out.println("Menggunakan binary search");
        System.out.println("----------------------------------------");

        double posisi2 = list.findbinarysearch(cari, 0, jumlahmhs-1);
        int pss2 = (int)posisi2;
        list.tampilposisi(cari, pss2);
        list.tampildataserach(cari, pss2);
        

        //System.out.println("Menggunakan sequential seraching");
        //double posisi = list.sequentialSearching(cari);
        //int pss = (int)posisi;
        //list.tampilposisi(cari, pss);
        //list.tampildataserach(cari, pss);
        

    }
}