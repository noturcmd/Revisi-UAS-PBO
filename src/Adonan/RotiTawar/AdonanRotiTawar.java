package Adonan.RotiTawar;

import Bahan.BAHAN;

public class AdonanRotiTawar implements BAHAN {
    public double tepungTerigu() {
        return 1_000;
    }

    public double gulaPasir() {
        return 125;
    }

    public double butter() {
        return 100;
    }

    public double ragi() {
        return 20;
    }

    public double susuBubuk() {
        return 250;
    }

    public double susuCair() {
        return 200;
    }

    public double telur() {
        return 70;
    }

    public double esBatu() {
        return 300;
    }

    public double totalGramResep() {
        return this.tepungTerigu() + this.butter() + this.ragi() + this.susuBubuk() + this.susuCair() + this.esBatu() + this.telur() + this.gulaPasir();
    }
}
