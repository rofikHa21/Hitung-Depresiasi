package com.company;

import java.util.Scanner;

public class Depresiasi {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.println("\nProgram Menghitung Depresiasi Aktiva Tetap");
        System.out.print("===========================================\nNominal Perolehan Aset : ");
        Double aset = data.nextDouble();
        System.out.print("Nilai Residu : ");
        Double residu = data.nextDouble();
        System.out.print("Periode Depresiasi: ");
        Integer periode = data.nextInt();

        //awal & akhir periode untuk menampilkan reantang waktu pada tabel

        System.out.print("Awal Periode: ");
        Integer awal = data.nextInt();
        System.out.print("Akhir Periode: ");
        Integer akhir = data.nextInt();
        System.out.println("\n\n");

        depresiasi(aset, residu, periode, awal, akhir);
    }

    protected static void depresiasi(Double aset, Double residu, Integer periode, Integer awal, Integer akhir) {
        if (aset != null && residu != null && periode != null && awal != null && akhir != null) {
            if (awal < akhir) {
                double penyusutan = (aset - residu) / periode;
                if (penyusutan < 0) {
                    System.out.println("==========================================");
                    System.out.println("Nilai Aset Tidak Valid");
                    System.out.println("==========================================");
                } else {
                    System.out.println("==========================================");
                    System.out.println("Aset\t\t Tahun\t Akumulasi\t Sisa");
                    System.out.println("==========================================");
                    for (int masa = awal; masa <= akhir; masa++) {
                        double akumulasi = masa * penyusutan;
                        double sisa = aset - akumulasi;
                        String hasil = String.format("%.2f\t\t%d \t%.2f\t %.2f", aset, masa, akumulasi, sisa);
                        System.out.println(hasil);
                    }
                }
            } else {
                System.out.println("Pastikan Nilai Awal Lebih Kecil");
            }
        } else {
            System.out.println("Kolom Tidak Boleh Kosong");
        }
    }
}
