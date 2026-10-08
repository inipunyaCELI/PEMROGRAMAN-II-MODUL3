package PRAK301_2510817120019_GtQowitaCeliaA;

import java.util.LinkedList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Dadu> listDadu= new LinkedList<>();

        int jumlah = scanner.nextInt();
        int totalNilai = 0;

        for (int i = 0; i < jumlah; i++) {
            Dadu d = new Dadu();
            listDadu.add(d);
        }

        for (int i = 0; i < listDadu.size(); i++) {
            int nilaiDadu = listDadu.get(i).getNilai();
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + nilaiDadu);
            totalNilai += nilaiDadu;
        }

        System.out.println("Total nilai dadu keseluruhan " + totalNilai);
        scanner.close();
    }
}
