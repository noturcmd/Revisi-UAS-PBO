package Adonan.Pizza;

import Bahan.BAHAN;

public class AdonanPizza implements BAHAN {
    public double tepungTerigu() {
        return 1_000;
    }

    public double gulaPasir() {
        return 100;
    }

    public double butter() {
        return 100;
    }

    public double ragi() {
        return 20;
    }

    public double susuBubuk() {
        return 200;
    }

    public double susuCair() {
        return 180;
    }

    public double telur() {
        return 50;
    }

    public double esBatu() {
        return 300;
    }

    public double totalGramResep(){
        return this.tepungTerigu() + this.butter() + this.ragi() + this.susuBubuk() + this.susuCair() + this.esBatu() + this.telur() + this.gulaPasir();
    }
}
