package PRAK303_2510817120019_GtQowitaCeliaA;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");

            String pilihanStr = input.nextLine().trim();
            if (pilihanStr.isEmpty()) continue;
            int pilihan = Integer.parseInt(pilihanStr);

            if (pilihan == 1) {
                System.out.print("Masukkan Nama Mahasiswa: ");
                String nama = input.nextLine();
                System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                String nim = input.nextLine().trim();

                listMahasiswa.add(new Mahasiswa(nama, nim));
                System.out.println("Mahasiswa " + nama + " ditambahkan.");

            } else if (pilihan == 2) {
                System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                String nimHapus = input.nextLine().trim();
                boolean ditemukan = false;

                for (int i = 0; i < listMahasiswa.size(); i++) {
                    if (listMahasiswa.get(i).getNim().equalsIgnoreCase(nimHapus)) {
                        listMahasiswa.remove(i);
                        ditemukan = true;
                        System.out.println("Mahasiswa dengan NIM " + nimHapus + " dihapus.");
                        break;
                    }
                }

                if (!ditemukan) {
                    System.out.println("Mahasiswa dengan NIM " + nimHapus + " tidak ditemukan.");
                }

            } else if (pilihan == 3) {
                System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
                String nimCari = input.nextLine().trim();
                boolean ditemukan = false;

                for (Mahasiswa m : listMahasiswa) {
                    if (m.getNim().equalsIgnoreCase(nimCari)) {
                        System.out.println("NIM: " + m.getNim() + ", Nama: " + m.getNama());
                        ditemukan = true;
                        break;
                    }
                }

                if (!ditemukan) {
                    System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan.");
                }

            } else if (pilihan == 4) {
                System.out.println("Daftar Mahasiswa:");
                for (Mahasiswa m : listMahasiswa) {
                    System.out.println("NIM: " + m.getNim() + ", Nama: " + m.getNama());
                }

            } else if (pilihan == 0) {
                listMahasiswa.clear();
                System.out.println("Terima kasih!");
                break;
            }
        }

        input.close();
    }
}