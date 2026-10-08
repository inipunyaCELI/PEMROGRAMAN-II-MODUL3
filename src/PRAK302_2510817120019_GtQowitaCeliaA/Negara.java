package PRAK302_2510817120019_GtQowitaCeliaA;

import java.util.HashMap;

public class Negara {
    private String nama;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private int tanggalKemerdekaan;
    private int bulanKemerdekaan;
    private int tahunKemerdekaan;

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin,
                  int tanggalKemerdekaan, int bulanKemerdekaan, int tahunKemerdekaan) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggalKemerdekaan;
        this.bulanKemerdekaan = bulanKemerdekaan;
        this.tahunKemerdekaan = tahunKemerdekaan;
    }

    // constructor untuk monarki
    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
    }

    public String getNama() {
        return nama;
    }

    public String getJenisKepemimpinan() {
        return jenisKepemimpinan;
    }

    public void tampilkanDetail(HashMap<Integer, String> mapBulan) {
        if (this.jenisKepemimpinan.equalsIgnoreCase("monarki")) {
            System.out.println("Negara " + this.nama + " mempunyai Raja bernama " + this.namaPemimpin + "\n");
        } else {
            String sebutanPemimpin = "";
            if (this.jenisKepemimpinan.equalsIgnoreCase("presiden")) {
                sebutanPemimpin = "Presiden";
            } else if (this.jenisKepemimpinan.equalsIgnoreCase("perdana menteri")) {
                sebutanPemimpin = "Perdana Menteri";
            }

            String namaBulan = mapBulan.get(this.bulanKemerdekaan);

            System.out.println("Negara " + this.nama + " mempunyai " + sebutanPemimpin + " bernama " + this.namaPemimpin);
            System.out.println("Deklarasi Kemerdekaan pada Tanggal " + this.tanggalKemerdekaan + " " + namaBulan + " " + this.tahunKemerdekaan + "\n");
        }
    }
}
