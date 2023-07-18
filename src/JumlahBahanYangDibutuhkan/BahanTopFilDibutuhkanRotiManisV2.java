package JumlahBahanYangDibutuhkan;

import AlurProgram.Tampilan;
import JumlahRotiPerAdonan.RotiManis.BanyakRotiPerAdonanRotiManis;

import static java.lang.String.format;

public class BahanTopFilDibutuhkanRotiManisV2 {
    int redbean = 10;
    int krimVanila = 5;

    public String bahanRedBeanDibutuhkanRotiManisV2(){
        return format("Red Bean \t\t: %d gram x %d pcs = %d gram", this.redbean, Integer.parseInt(Tampilan.getJumlahRoti()),redbean * Integer.parseInt(Tampilan.getJumlahRoti()));
    }
    public String bahanKrimVanilaDibutuhkanRotiManisV2(){
        return format("Krim Vanila \t: %d gram x %d pcs = %d gram", this.krimVanila, Integer.parseInt(Tampilan.getJumlahRoti()),krimVanila * Integer.parseInt(Tampilan.getJumlahRoti()));
    }

    public String totalBahanDibutuhkan(){
        return format("- %s\n- %s", this.bahanRedBeanDibutuhkanRotiManisV2(), bahanKrimVanilaDibutuhkanRotiManisV2());
    }
}
