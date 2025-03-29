import java.util.Scanner;

public class Dosenmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Datadosen10 d = new Datadosen10();

        System.out.print("Masukkan jumlah dosen yang ingin ditambahkan : ");
        int jumlahdosen = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlahdosen; i++) {
            System.out.println("\nMasukkan data dosen ke-" + (i + 1));
            System.out.print("Kode: ");
            String kode = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (true=Laki-laki, false=Perempuan): ");
            boolean jk = sc.nextBoolean();
            System.out.print("Usia: ");
            int usia = sc.nextInt();
            sc.nextLine(); 

            d.tambah(new Dosen10(kode, nama, jk, usia));
        }

        System.out.println("Data Seluruh Dosen : ");
        System.out.println("--------------------------------");
        d.tampil();

        System.out.print("Masukkan nama dosen yang ingin dicari : ");
        String carinama = sc.nextLine();
        d.PencarianDatasequential10(carinama);

        System.out.print("Masukkan usia dosen yang ingin dicari : ");
        int cariusia = sc.nextInt();
        d.pencariandatabinary10(cariusia);

        sc.close();

    }
}
    

            