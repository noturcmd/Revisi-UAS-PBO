package Adonan.RotiManis;

import Bahan.HargaBahan;

public class HargaAdonanRotiManis extends HargaBahan{
    public double hitungHargaAdonanRotiManis(){
        return this.gulaPasir() + (this.ragi() * 2) + this.telur() + this.butter() + this.susuCair() + this.susuBubuk() +this.tepungTerigu() + this.esBatu();
    }
}
