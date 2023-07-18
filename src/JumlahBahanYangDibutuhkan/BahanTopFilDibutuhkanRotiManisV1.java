package JumlahBahanYangDibutuhkan;

import AlurProgram.Tampilan;
import JumlahRotiPerAdonan.RotiManis.BanyakRotiPerAdonanRotiManis;

import static java.lang.String.format;

public class BahanTopFilDibutuhkanRotiManisV1 {
    int coklatRotmanV1 = 10;
    int kejuRotmanv1 = 5;

    public String bahanCoklatDibutuhkanRotiManisV1(){
        return format("Coklat \t\t: %d gram x %d pcs = %d gram", this.coklatRotmanV1, Integer.parseInt(Tampilan.getJumlahRoti()),coklatRotmanV1 * Integer.parseInt(Tampilan.getJumlahRoti()));
    }
    public String bahanKejuDibutuhkanRotiManisV1(){
        return format("Keju \t\t\t: %d gram x %d pcs = %d gram", this.kejuRotmanv1, Integer.parseInt(Tampilan.getJumlahRoti()),kejuRotmanv1 * Integer.parseInt(Tampilan.getJumlahRoti()));
    }

    public String totalBahanDibutuhkan(){
        return format("- %s\n- %s", this.bahanCoklatDibutuhkanRotiManisV1(), this.bahanKejuDibutuhkanRotiManisV1());
    }

}
