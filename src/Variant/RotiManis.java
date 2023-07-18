package Variant;

import Adonan.RotiManis.HargaAdonanRotiManis;
import Bahan.HargaTopFill;
import Variant.VariantRoti;

public class RotiManis implements VariantRoti {
    HargaTopFill hargaTopFill = new HargaTopFill();

    HargaAdonanRotiManis harm1 = new HargaAdonanRotiManis();
    public double hargaVariant1() {
        return hargaTopFill.keju() + hargaTopFill.coklat() + harm1.hitungHargaAdonanRotiManis();
    }

    public double hargaVariant2() {
        return hargaTopFill.selaiRedBean() + hargaTopFill.krimVanila() + harm1.hitungHargaAdonanRotiManis();
    }

    public double hargaVariant3() {
        return (hargaTopFill.keju() * 2) + hargaTopFill.sosis() + harm1.hitungHargaAdonanRotiManis();
    }
}
