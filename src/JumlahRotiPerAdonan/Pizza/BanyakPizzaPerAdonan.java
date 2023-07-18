package JumlahRotiPerAdonan.Pizza;

import Adonan.Pizza.AdonanPizza;
import Takaran.TakaranGramRoti;

public class BanyakPizzaPerAdonan extends AdonanPizza {
    TakaranGramRoti takaranPizza = new TakaranGramRoti();
    public double hitungJumlahRotiPerAdonanPizza(){
        return totalGramResep() / this.takaranPizza.getTakaranPizza();
    }
}