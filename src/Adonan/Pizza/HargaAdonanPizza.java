package Adonan.Pizza;

import Bahan.HargaBahan;

public class HargaAdonanPizza extends HargaBahan {
    public double hitungHargaAdonanPizza(){
        return this.gulaPasir() + (this.ragi() * 2) + this.telur() + this.butter() + this.susuCair() + this.susuBubuk() +this.tepungTerigu() + this.esBatu();
    }
}
