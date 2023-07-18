package JumlahBahanYangDibutuhkan;

import AlurProgram.Tampilan;

import static java.lang.String.format;

public class BahanTopFilDibutuhkanRotiTawarV1 {
    int coklat = 80;

    public String bahanCoklatDibutuhkanRotiTawarV1(){
        return format("Coklat \t\t: %d gram x %d pcs = %d", this.coklat,Integer.parseInt(Tampilan.getJumlahRoti()),coklat * Integer.parseInt(Tampilan.getJumlahRoti()));
    }

    public String totalBahanDibutuhkan(){
        return format("- %s\n", this.bahanCoklatDibutuhkanRotiTawarV1());
    }
}
