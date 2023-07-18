package JumlahBahanYangDibutuhkan;

import AlurProgram.Tampilan;

import static java.lang.String.format;

public class BahanTopFilDibutuhkanRotiManisV3 {

    int keju = 10;
    int sosis = 10;

    public String bahanSosisDibutuhkanRotiManisV3(){
        return format("Sosis \t\t: %d gram x %d pcs = %d gram", this.sosis, Integer.parseInt(Tampilan.getJumlahRoti()),this.sosis * Integer.parseInt(Tampilan.getJumlahRoti()));
    }
    public String bahanKejuDibutuhkanRotiManisV3(){
        return format("Keju \t\t\t: %d gram x %d pcs = %d gram", this.keju, Integer.parseInt(Tampilan.getJumlahRoti()),keju * Integer.parseInt(Tampilan.getJumlahRoti()));
    }

    public String totalBahanDibutuhkan(){
        return format("- %s\n- %s", this.bahanKejuDibutuhkanRotiManisV3(), this.bahanSosisDibutuhkanRotiManisV3());
    }
}
