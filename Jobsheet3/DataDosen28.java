package Jobsheet3;

public class DataDosen28 {

    public void dataSemuaDosen(Dosen28[] arrayOfDosen) {
        System.out.println("\n======= DATA SEMUA DOSEN =======");
        for (Dosen28 dosen : arrayOfDosen) {
            System.out.println("Kode          : " + dosen.kode);
            System.out.println("Nama          : " + dosen.nama);
            System.out.println("Jenis Kelamin : " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + dosen.usia);
            System.out.println("--------------------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen28[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen28 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) pria++;
            else wanita++;
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    public void ratarataUsiaDosenPerJenisKelamin(Dosen28[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jmlPria = 0, jmlWanita = 0;

        for (Dosen28 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                jmlPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                jmlWanita++;
            }
        }

        System.out.println("Rata-rata Usia Pria   : " + (jmlPria > 0 ? (double) totalUsiaPria / jmlPria : 0));
        System.out.println("Rata-rata Usia Wanita : " + (jmlWanita > 0 ? (double) totalUsiaWanita / jmlWanita : 0));
    }

    public void infoDosenPalingTua(Dosen28[] arrayOfDosen) {
        Dosen28 tertua = arrayOfDosen[0];
        for (Dosen28 dosen : arrayOfDosen) {
            if (dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }
        System.out.println("\n======= DOSEN PALING TUA =======");
        System.out.println("Nama : " + tertua.nama + " (" + tertua.usia + " tahun)");
    }

    public void infoDosenPalingMuda(Dosen28[] arrayOfDosen) {
        Dosen28 termuda = arrayOfDosen[0];
        for (Dosen28 dosen : arrayOfDosen) {
            if (dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }
        System.out.println("\n======= DOSEN PALING MUDA =======");
        System.out.println("Nama : " + termuda.nama + " (" + termuda.usia + " tahun)");
    }
}