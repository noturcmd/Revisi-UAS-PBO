package JumlahRotiPerAdonan.RotiManis;

import Adonan.RotiManis.AdonanRotiManis;
import Takaran.TakaranGramRoti;

public class BanyakRotiPerAdonanRotiManis extends AdonanRotiManis{
    TakaranGramRoti takaranRotiManis = new TakaranGramRoti();
    public double hitungJumlahRotiPerAdonanRotiManis(){
        return totalGramResep() / this.takaranRotiManis.getTakaranRotiManis();
    }
}
