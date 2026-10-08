package PRAK301_2510817120019_GtQowitaCeliaA;

import java.util.Random;

public class Dadu {
    private int nilai;

    public Dadu() {
        acakNilai();
    }

    public void acakNilai() {
        Random rand = new Random();
        this.nilai = rand.nextInt(6) + 1;
    }

    public int getNilai() {
        return this.nilai;
    }
}
