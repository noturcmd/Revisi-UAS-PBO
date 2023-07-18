package JumlahBahanYangDibutuhkan;

import AlurProgram.Tampilan;

import static java.lang.String.format;

public class BahanTopFilDibutuhkanPizzaV1 {
    int sosis = 50;
    int keju = 30;
    int smokedBeef = 50;
    int bawangBombay = 30;

    public String bahanKejuDibutuhkanRotiManisV1(){
        return format("Keju \t\t\t: %d gram x %d pcs = %d gram", this.keju, Integer.parseInt(Tampilan.getJumlahRoti()),this.keju * Integer.parseInt(Tampilan.getJumlahRoti()));
    }
    public String bahanSosisDibutuhkanRotiManisV1(){
        return format("Sosis \t\t: %d gram x %d pcs = %d gram", this.sosis, Integer.parseInt(Tampilan.getJumlahRoti()),this.sosis * Integer.parseInt(Tampilan.getJumlahRoti()));
    }
    public String bahanSmokedBeefDibutuhkanRotiManisV1(){
        return format("Smoked Beef \t: %d gram x %d pcs = %d gram", this.smokedBeef, Integer.parseInt(Tampilan.getJumlahRoti()),this.smokedBeef * Integer.parseInt(Tampilan.getJumlahRoti()));
    }
    public String bahanBawangBombayDibutuhkanRotiManisV1(){
        return format("Bawang Bombay : %d gram x %d pcs = %d gram", this.bawangBombay, Integer.parseInt(Tampilan.getJumlahRoti()),this.bawangBombay * Integer.parseInt(Tampilan.getJumlahRoti()));
    }

    public String totalBahanDibutuhkan(){
        return format("- %s\n- %s\n- %s\n- %s", this.bahanKejuDibutuhkanRotiManisV1(), this.bahanSosisDibutuhkanRotiManisV1(), this.bahanSmokedBeefDibutuhkanRotiManisV1(), this.bahanBawangBombayDibutuhkanRotiManisV1());
    }
}
