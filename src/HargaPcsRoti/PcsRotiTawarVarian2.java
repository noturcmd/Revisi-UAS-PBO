package HargaPcsRoti;

import JumlahRotiPerAdonan.RotiTawar.BanyakRotiPerAdonanRotiTawar;
import Variant.RotiTawar;

public class PcsRotiTawarVarian2 {
    static RotiTawar rt1 = new RotiTawar();
    static BanyakRotiPerAdonanRotiTawar banyak = new BanyakRotiPerAdonanRotiTawar();
    static double hitungTotalHarga(){
        return (rt1.hargaVariant2() / banyak.hitungJumlahRotiPerAdonanRotiTawar());
    }

    public static double gethitungHargaJumlahPesanan(){
        return (hitungTotalHarga() + ((double) 40 /100 * hitungTotalHarga()));
    }
    public static int hitungHargaTotalBulat(){
        return (int) (Math.round(gethitungHargaJumlahPesanan() / 100) * 100);
    }
}
