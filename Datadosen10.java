import java.util.ArrayList;

public class Datadosen10 {
    Dosen10 [] datadosen = new Dosen10[100];
    int idx;

    void tambah (Dosen10 dsn) {
        if (idx < datadosen.length) {
            datadosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh.");
        }
    }

    void tampil () {
        if (idx == 0) {
            System.out.println("Belum ada data dosen");
            return;
        }
        for (int i = 0; i < idx; i++) {
            datadosen[i].tampil();
            System.out.println("--------------------------------");
        }
    }


    void  PencarianDatasequential10 (String cari) {
        int jumlahditemukan = 0;
        System.out.println("\nHasil Pencarian Nama:");
        for (int i = 0; i < idx; i++) {
            if (datadosen[i].nama.equalsIgnoreCase(cari)) {
                System.out.println("--------------------------------");
                datadosen[i].tampil();
                System.out.println("--------------------------------");
                jumlahditemukan++;
            }
        }
        if (jumlahditemukan==0) {
            System.out.println("Nama dosen tidak ditemukan.");
        } else if (jumlahditemukan > 1) {
            System.out.println("Ada lebih dari satu dosen dengan nama " + cari + " !");
        }
    }

    void sortUsiaASC() { // Sorting usia secara ascending
    for (int i = 0; i < idx - 1; i++) {
        for (int j = 0; j < idx - i - 1; j++) {
            if (datadosen[j].usia > datadosen[j + 1].usia) {
                Dosen10 tmp = datadosen[j];
                datadosen[j] = datadosen[j + 1];
                datadosen[j + 1] = tmp;
            }
        }
    }
}

void pencariandatabinary10(int cari) {
    sortUsiaASC(); // Pastikan data sudah terurut ASC sebelum mencari

    int left = 0, right = idx - 1;
    boolean found = false;
    ArrayList<Integer> hasilIndex = new ArrayList<>();

    while (left <= right) {
        int mid = (left + right) / 2;

        if (datadosen[mid].usia == cari) {
            // Jika ditemukan, cek ke kiri dan kanan untuk mencari semua hasil
            int i = mid;
            while (i >= 0 && datadosen[i].usia == cari) {
                hasilIndex.add(i);
                i--;
            }
            i = mid + 1;
            while (i < idx && datadosen[i].usia == cari) {
                hasilIndex.add(i);
                i++;
            }
            found = true;
            break;
        } else if (datadosen[mid].usia < cari) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    // Tampilkan hasil pencarian
    if (found) {
        System.out.println("\nHasil Pencarian Usia " + cari + ":");
        for (int index : hasilIndex) {
            datadosen[index].tampil();
            System.out.println("--------------------------------");
        }
        if (hasilIndex.size() > 1) {
            System.out.println( "Ada lebih dari satu dosen dengan usia " + cari + "!");
        }
    } else {
        System.out.println("Tidak ada dosen dengan usia " + cari);
    }
}

}