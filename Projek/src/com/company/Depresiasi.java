package com.company;
import java.util.Scanner;

public class Depresiasi {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.println("Program Menghitung Depresiasi Aktiva Tetap");
        System.out.print("===========================================\n\nNominal Perolehan Aset : ");
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

        depresiasi(aset, residu, periode, awal, akhir);
    }

    protected static void depresiasi(Double aset, Double residu, Integer periode, Integer awal, Integer akhir) {
        if (aset != null && residu != null && periode != null && awal != null && akhir != null) {
            if (awal < akhir) {
                System.out.println("Aset\t\tTahun\tAkumulasi\tSisa");
                System.out.println("==========================================");
                double penyusutan = (aset - residu) / periode;
                System.out.println(penyusutan);
            } else {
                System.out.println("Pastikan Nilai Awal Lebih Kecil");
            }
        }
    }
}
