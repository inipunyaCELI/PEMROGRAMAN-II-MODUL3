package PRAK302_2510817120019_GtQowitaCeliaA;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Negara> listNegara = new LinkedList<>();

        HashMap<Integer, String> mapBulan = new HashMap<>();
        mapBulan.put(1, "Januari");
        mapBulan.put(2, "Februari");
        mapBulan.put(3, "Maret");
        mapBulan.put(4, "April");
        mapBulan.put(5, "Mei");
        mapBulan.put(6, "Juni");
        mapBulan.put(7, "Juli");
        mapBulan.put(8, "Agustus");
        mapBulan.put(9, "September");
        mapBulan.put(10, "Oktober");
        mapBulan.put(11, "November");
        mapBulan.put(12, "Desember");

        int jumlahNegara = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlahNegara; i++) {
            String nama = input.nextLine();
            String jenisKepemimpinan = input.nextLine();
            String namaPemimpin = input.nextLine();

            if (jenisKepemimpinan.equalsIgnoreCase("monarki")) {
                listNegara.add(new Negara(nama, jenisKepemimpinan, namaPemimpin));
            } else {
                int tanggal =  input.nextInt();
                int bulan = input.nextInt();
                int tahun = input.nextInt();;
                input.nextLine();

                listNegara.add(new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggal, bulan, tahun));
            }
        }
        for (Negara n : listNegara) {
            n.tampilkanDetail(mapBulan);
        }
        input.close();
    }
}
