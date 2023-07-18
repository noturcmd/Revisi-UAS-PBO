package JumlahRotiPerAdonan.RotiTawar;

import Takaran.TakaranGramRoti;
import Variant.RotiTawar;
import Adonan.RotiTawar.AdonanRotiTawar;

public class BanyakRotiPerAdonanRotiTawar extends AdonanRotiTawar {
    TakaranGramRoti takaranRotiTawar = new TakaranGramRoti();
    public double hitungJumlahRotiPerAdonanRotiTawar(){

        return totalGramResep() / this.takaranRotiTawar.getTakaranRotiTawar();
    }
}
