package JumlahBahanYangDibutuhkan;

import Adonan.Pizza.AdonanPizza;
import AlurProgram.Tampilan;
import JumlahRotiPerAdonan.Pizza.BanyakPizzaPerAdonan;
import JumlahRotiPerAdonan.RotiManis.BanyakRotiPerAdonanRotiManis;

import static java.lang.String.format;

public class BahanYangDibutuhkanPizza extends AdonanPizza{
    BanyakPizzaPerAdonan banyakRoti = new BanyakPizzaPerAdonan();
    @Override
    public double tepungTerigu() {
        return super.tepungTerigu() / banyakRoti.hitungJumlahRotiPerAdonanPizza();
    }

    @Override
    public double gulaPasir() {
        return super.gulaPasir() / banyakRoti.hitungJumlahRotiPerAdonanPizza();
    }

    @Override
    public double butter() {
        return super.butter() / banyakRoti.hitungJumlahRotiPerAdonanPizza();
    }

    @Override
    public double ragi() {
        return super.ragi() / banyakRoti.hitungJumlahRotiPerAdonanPizza();
    }

    @Override
    public double susuBubuk() {
        return super.susuBubuk() / banyakRoti.hitungJumlahRotiPerAdonanPizza();
    }

    @Override
    public double susuCair() {
        return super.susuCair() / banyakRoti.hitungJumlahRotiPerAdonanPizza();
    }

    @Override
    public double telur() {
        return super.telur() / banyakRoti.hitungJumlahRotiPerAdonanPizza();
    }

    @Override
    public double esBatu() {
        return super.esBatu() / banyakRoti.hitungJumlahRotiPerAdonanPizza();
    }
    public String totalTepungTerigu() {
        return format("Tepung Terigu : %.2f gram x %d pcs = %.2f gram", this.tepungTerigu(), Integer.parseInt(Tampilan.getJumlahRoti()),this.tepungTerigu() * Integer.parseInt(Tampilan.getJumlahRoti()));
    }

    public String totalGulaPasir() {
        return format("Gula Pasir \t: %.2f gram x %d pcs = %.2f gram", this.gulaPasir(),Integer.parseInt(Tampilan.getJumlahRoti()),this.gulaPasir() * Integer.parseInt(Tampilan.getJumlahRoti()));
    }

    public String totalButter() {
        return format("Butter \t\t: %.2f gram x %d pcs = %.2f gram", this.butter(), Integer.parseInt(Tampilan.getJumlahRoti()),this.butter() * Integer.parseInt(Tampilan.getJumlahRoti()));
    }

    public String totalRagi() {
        return format("Ragi \t\t\t: %.2f gram x %d pcs = %.2f gram", this.ragi(), Integer.parseInt(Tampilan.getJumlahRoti()),this.ragi() * Integer.parseInt(Tampilan.getJumlahRoti()));
    }

    public String totalSusuBubuk() {
        return format("Susu Bubuk \t: %.2f gram x %d pcs = %.2f gram", this.susuBubuk(),Integer.parseInt(Tampilan.getJumlahRoti()),this.susuBubuk() * Integer.parseInt(Tampilan.getJumlahRoti()));
    }

    public String totalSusuCair() {
        return format("Susu Cair \t: %.2f gram x %d pcs = %.2f gram", this.susuCair(), Integer.parseInt(Tampilan.getJumlahRoti()),this.susuCair() * Integer.parseInt(Tampilan.getJumlahRoti()));
    }

    public String totalTelur() {
        return format("Telur \t\t: %.2f gram x %d pcs = %.2f gram", this.telur(), Integer.parseInt(Tampilan.getJumlahRoti()), this.telur() * Integer.parseInt(Tampilan.getJumlahRoti()));
    }

    public String totalEsBatu() {
        return format("Es Batu \t\t: %.2f gram x %d pcs = %.2f gram", this.esBatu(),Integer.parseInt(Tampilan.getJumlahRoti()),this.esBatu() * Integer.parseInt(Tampilan.getJumlahRoti()));
    }
}
