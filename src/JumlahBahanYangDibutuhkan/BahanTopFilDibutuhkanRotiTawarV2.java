package JumlahBahanYangDibutuhkan;

import AlurProgram.Tampilan;

import static java.lang.String.format;

public class BahanTopFilDibutuhkanRotiTawarV2 {
    int keju = 80;

    public String bahanCoklatDibutuhkanRotiTawarV1(){
        return format("keju \t\t\t: %d gram x %d pcs = %d gram", this.keju, Integer.parseInt(Tampilan.getJumlahRoti()),keju * Integer.parseInt(Tampilan.getJumlahRoti()));
    }

    public String totalBahanDibutuhkan(){
        return format("- %s\n", this.bahanCoklatDibutuhkanRotiTawarV1());
    }
}
