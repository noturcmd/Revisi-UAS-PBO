package Variant;

import Adonan.Pizza.HargaAdonanPizza;
import Bahan.HargaTopFill;

public class Pizza implements VariantRoti{
    HargaTopFill hargaTopFill = new HargaTopFill();

    HargaAdonanPizza harm1 = new HargaAdonanPizza();
    public double hargaVariant1() {
        return (hargaTopFill.keju() * 2)+ hargaTopFill.sosis() + hargaTopFill.smokedBeef() + hargaTopFill.bawangBombay() + harm1.hitungHargaAdonanPizza();
    }

}
