package Variant;

import Adonan.RotiManis.HargaAdonanRotiManis;
import Adonan.RotiTawar.HargaAdonanRotiTawar;
import Bahan.HargaTopFill;

public class RotiTawar implements VariantRoti{
    HargaTopFill hargaTopFill = new HargaTopFill();

    HargaAdonanRotiTawar harm1 = new HargaAdonanRotiTawar();
    public double hargaVariant1() {
        return hargaTopFill.coklat() + harm1.hitungHargaAdonanRotiTawar();
    }

    public double hargaVariant2() {
        return (hargaTopFill.keju() * 2) + harm1.hitungHargaAdonanRotiTawar();
    }
}
