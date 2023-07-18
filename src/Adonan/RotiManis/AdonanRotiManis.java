package Adonan.RotiManis;

import Bahan.BAHAN;

public class AdonanRotiManis implements BAHAN {
    public double tepungTerigu() {
        return 1_000;
    }

    public double gulaPasir() {
        return 150;
    }

    public double butter() {
        return 150;
    }

    public double ragi() {
        return 20;
    }

    public double susuBubuk() {
        return 300;
    }

    public double susuCair() {
        return 250;
    }

    public double telur() {
        return 80;
    }

    public double esBatu() {
        return 400;
    }

    public double totalGramResep(){
        return this.tepungTerigu() + this.butter() + this.ragi() + this.susuBubuk() + this.susuCair() + this.esBatu() + this.telur() + this.gulaPasir();
    }

}
