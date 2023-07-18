package HargaPcsRoti;

import JumlahRotiPerAdonan.RotiManis.BanyakRotiPerAdonanRotiManis;
import Variant.RotiManis;

public class PcsRotiManisVarian2 {
    static RotiManis rm1 = new RotiManis();
    static BanyakRotiPerAdonanRotiManis banyak = new BanyakRotiPerAdonanRotiManis();
    static double hitungTotalHarga(){
        return (rm1.hargaVariant2() / banyak.hitungJumlahRotiPerAdonanRotiManis());
    }

    public static double gethitungHargaJumlahPesanan(){
        return (hitungTotalHarga() + ((double) 40 /100 * hitungTotalHarga()));
    }
    public static int hitungHargaTotalBulat(){
        return (int) (Math.round(gethitungHargaJumlahPesanan() / 100) * 100);
    }


}
