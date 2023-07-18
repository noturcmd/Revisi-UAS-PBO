package Adonan.RotiTawar;

import Bahan.HargaBahan;

public class HargaAdonanRotiTawar extends HargaBahan {
    public double hitungHargaAdonanRotiTawar(){
        return this.gulaPasir() + (this.ragi() * 2) + this.telur() + this.butter() + this.susuCair() + this.susuBubuk() +this.tepungTerigu() + this.esBatu();
    }
}
