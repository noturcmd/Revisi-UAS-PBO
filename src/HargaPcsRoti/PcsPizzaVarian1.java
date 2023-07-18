package HargaPcsRoti;

import JumlahRotiPerAdonan.Pizza.BanyakPizzaPerAdonan;
import JumlahRotiPerAdonan.RotiManis.BanyakRotiPerAdonanRotiManis;
import Variant.Pizza;
import Variant.RotiManis;

public class PcsPizzaVarian1 {
    static Pizza pizz1 = new Pizza();
    static BanyakPizzaPerAdonan banyak = new BanyakPizzaPerAdonan();
    static double hitungTotalHarga(){
        return (pizz1.hargaVariant1() / banyak.hitungJumlahRotiPerAdonanPizza());
    }

    public static double gethitungHargaJumlahPesanan(){
        return (hitungTotalHarga() + ((double) 40 /100 * hitungTotalHarga()));
    }

    public static int hitungHargaTotalBulat(){
        return (int) (Math.round(gethitungHargaJumlahPesanan() / 100) * 100);
    }
}
