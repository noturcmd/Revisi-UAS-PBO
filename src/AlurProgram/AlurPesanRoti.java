package AlurProgram;

import HargaPcsRoti.*;
import JumlahBahanYangDibutuhkan.*;

import java.util.ArrayList;

import static java.lang.String.format;


public class AlurPesanRoti {
    static String variant;
    static BahanYangDibutuhkanRotiManis bahanRotiManis = new BahanYangDibutuhkanRotiManis();
    static BahanYangDibutuhkanRotiTawar bahanRotiTawar = new BahanYangDibutuhkanRotiTawar();
    static BahanYangDibutuhkanPizza bahanPizza = new BahanYangDibutuhkanPizza();
    static BahanTopFilDibutuhkanRotiManisV1 bahanTopfilRotmanv1 = new BahanTopFilDibutuhkanRotiManisV1();
    static BahanTopFilDibutuhkanRotiManisV2 bahanTopfilRotmanv2 = new BahanTopFilDibutuhkanRotiManisV2();
    static BahanTopFilDibutuhkanRotiManisV3 bahanTopfilRotmanv3 = new BahanTopFilDibutuhkanRotiManisV3();
    static BahanTopFilDibutuhkanRotiTawarV1 bahanTopFilRotarv1 = new BahanTopFilDibutuhkanRotiTawarV1();
    static BahanTopFilDibutuhkanRotiTawarV2 bahanTopFilRotarv2 = new BahanTopFilDibutuhkanRotiTawarV2();
    static BahanTopFilDibutuhkanPizzaV1 bahanTopFilPizzav1 = new BahanTopFilDibutuhkanPizzaV1();
    public static void  RotiManis() {
        while(true) {
            System.out.print("Varian \t\t\t\t\t\t\t\t\t : ");
            AlurPesanRoti.variant = Tampilan.inputUser.next();
            if (!(AlurPesanRoti.variant.equals("1")) && !(AlurPesanRoti.variant.equals("2")) && !(AlurPesanRoti.variant.equals("3"))) {
                System.out.println("Maaf, Input Anda salah");
            } else if (AlurPesanRoti.variant.matches("[a-zA-Z]+")) {
                System.out.println("Maaf, harus inputan Angka!");
            } else if (AlurPesanRoti.variant.equals("1")) {
                Tampilan.setVarianRoti(AlurPesanRoti.variant);
                Tampilan.jenisPesananVarian.add(Integer.parseInt(Tampilan.getVarianRoti()));
                while(true) {
                    System.out.print("Jumlah Pcs \t\t\t\t\t\t\t\t : ");
                    Tampilan.setJumlahRoti(Tampilan.inputUser.next());
                    if(Integer.parseInt(Tampilan.getJumlahRoti()) <= 0){
                        System.out.println("Input tidak boleh negatif atau nol!");
                    }else if(Tampilan.getJumlahRoti().matches("[a-zA-Z]+")){
                        System.out.println("Input jumlah harus angka!");
                    }else{
                        break;
                    }
                }
                Tampilan.jumlahPesananRoti.add(Integer.parseInt(Tampilan.getJumlahRoti()));
                Tampilan.kumpulanBiaya.add(Integer.parseInt(Tampilan.getJumlahRoti()) * PcsRotiManisVarian1.hitungHargaTotalBulat());
                Tampilan.bahanAdonan.add(format("- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n%s", bahanRotiManis.totalTepungTerigu(), bahanRotiManis.totalGulaPasir(), bahanRotiManis.totalButter(), bahanRotiManis.totalRagi(), bahanRotiManis.totalSusuBubuk(), bahanRotiManis.totalSusuCair(), bahanRotiManis.totalTelur(), bahanRotiManis.totalEsBatu(), bahanTopfilRotmanv1.totalBahanDibutuhkan()));
                break;
            } else if (AlurPesanRoti.variant.equals("2")) {
                Tampilan.setVarianRoti(AlurPesanRoti.variant);
                Tampilan.jenisPesananVarian.add(Integer.parseInt(Tampilan.getVarianRoti()));
                while(true) {
                    System.out.print("Jumlah Pcs \t\t\t\t\t\t\t\t : ");
                    Tampilan.setJumlahRoti(Tampilan.inputUser.next());
                    if(Integer.parseInt(Tampilan.getJumlahRoti()) <= 0){
                        System.out.println("Input tidak boleh negatif atau nol!");
                    }else if(Tampilan.getJumlahRoti().matches("[a-zA-Z]")){
                        System.out.println("Input harus angka!");
                    }else{
                        break;
                    }
                }
                Tampilan.jumlahPesananRoti.add(Integer.parseInt(Tampilan.getJumlahRoti()));
                Tampilan.kumpulanBiaya.add(Integer.parseInt(Tampilan.getJumlahRoti()) * PcsRotiManisVarian2.hitungHargaTotalBulat());
                Tampilan.bahanAdonan.add(format("- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n%s", bahanRotiManis.totalTepungTerigu(), bahanRotiManis.totalGulaPasir(), bahanRotiManis.totalButter(), bahanRotiManis.totalRagi(), bahanRotiManis.totalSusuBubuk(), bahanRotiManis.totalSusuCair(), bahanRotiManis.totalTelur(), bahanRotiManis.totalEsBatu(), bahanTopfilRotmanv2.totalBahanDibutuhkan()));
                break;
            } else if(AlurPesanRoti.variant.equals("3")){
                Tampilan.setVarianRoti(AlurPesanRoti.variant);
                Tampilan.jenisPesananVarian.add(Integer.parseInt(Tampilan.getVarianRoti()));
                System.out.print("Jumlah Pcs \t\t\t\t\t\t\t\t : ");
                Tampilan.setJumlahRoti(Tampilan.inputUser.next());
                Tampilan.jumlahPesananRoti.add(Integer.parseInt(Tampilan.getJumlahRoti()));
                Tampilan.kumpulanBiaya.add(Integer.parseInt(Tampilan.getJumlahRoti()) * PcsRotiManisVarian3.hitungHargaTotalBulat());
                Tampilan.bahanAdonan.add(format("- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n%s", bahanRotiManis.totalTepungTerigu(), bahanRotiManis.totalGulaPasir(), bahanRotiManis.totalButter(), bahanRotiManis.totalRagi(), bahanRotiManis.totalSusuBubuk(), bahanRotiManis.totalSusuCair(), bahanRotiManis.totalTelur(), bahanRotiManis.totalEsBatu(), bahanTopfilRotmanv3.totalBahanDibutuhkan()));
                break;
            }else {
                System.out.println("Input tidak boleh 0 atau negatif!");
            }
        }
    }
    public static void  RotiTawar() {
        while(true) {
            System.out.print("Varian \t\t\t\t\t\t\t\t\t : ");
            AlurPesanRoti.variant = Tampilan.inputUser.next();
            if (!(AlurPesanRoti.variant.equals("1")) && !(AlurPesanRoti.variant.equals("2")) && !(AlurPesanRoti.variant.equals("3"))) {
                System.out.println("Maaf, Input Anda salah!");
            } else if (AlurPesanRoti.variant.equals("1")) {
                Tampilan.setVarianRoti(AlurPesanRoti.variant);
                Tampilan.jenisPesananVarian.add(Integer.parseInt(Tampilan.getVarianRoti()));
                System.out.print("Jumlah Pcs \t\t\t\t\t\t\t\t : ");
                Tampilan.setJumlahRoti(Tampilan.inputUser.next());
                Tampilan.jumlahPesananRoti.add(Integer.parseInt(Tampilan.getJumlahRoti()));
                Tampilan.kumpulanBiaya.add(Integer.parseInt(Tampilan.getJumlahRoti()) * PcsRotiTawarVarian1.hitungHargaTotalBulat());
                Tampilan.bahanAdonan.add(format("- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n%s", bahanRotiTawar.totalTepungTerigu(), bahanRotiTawar.totalGulaPasir(), bahanRotiTawar.totalButter(), bahanRotiTawar.totalRagi(), bahanRotiTawar.totalSusuBubuk(), bahanRotiTawar.totalSusuCair(), bahanRotiTawar.totalTelur(), bahanRotiTawar.totalEsBatu(), bahanTopFilRotarv1.totalBahanDibutuhkan()));
                break;
            } else if (AlurPesanRoti.variant.equals("2")) {
                Tampilan.setVarianRoti(AlurPesanRoti.variant);
                Tampilan.jenisPesananVarian.add(Integer.parseInt(Tampilan.getVarianRoti()));
                while(true) {
                    System.out.print("Jumlah Pcs \t\t\t\t\t\t\t\t : ");
                    Tampilan.setJumlahRoti(Tampilan.inputUser.next());
                    if(Integer.parseInt(Tampilan.getJumlahRoti()) <= 0){
                        System.out.println("Input tidak boleh negatif atau nol!");
                    }else{
                        break;
                    }
                }
                Tampilan.jumlahPesananRoti.add(Integer.parseInt(Tampilan.getJumlahRoti()));
                Tampilan.kumpulanBiaya.add(Integer.parseInt(Tampilan.getJumlahRoti()) * PcsRotiTawarVarian2.hitungHargaTotalBulat());
                Tampilan.bahanAdonan.add(format("- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n%s", bahanRotiTawar.totalTepungTerigu(), bahanRotiTawar.totalGulaPasir(), bahanRotiTawar.totalButter(), bahanRotiTawar.totalRagi(), bahanRotiTawar.totalSusuBubuk(), bahanRotiTawar.totalSusuCair(), bahanRotiTawar.totalTelur(), bahanRotiTawar.totalEsBatu(), bahanTopFilRotarv2.totalBahanDibutuhkan()));
                break;
            } else if(AlurPesanRoti.variant.equals("3")){
                System.out.println("Mohon Maaf, untuk sementara varian 3 belum tersedia");
            }else {
                System.out.println("Input tidak boleh 0 atau negatif!");
            }
        }
    }
    public static void Pizza() {
        while(true) {
            System.out.print("Varian \t\t\t\t\t\t\t\t\t : ");
            AlurPesanRoti.variant = Tampilan.inputUser.next();
            if (!(AlurPesanRoti.variant.equals("1")) && !(AlurPesanRoti.variant.equals("2")) && !(AlurPesanRoti.variant.equals("3"))) {
                System.out.println("Maaf, Input Anda salah!");
            } else if (AlurPesanRoti.variant.equals("1")) {
                Tampilan.setVarianRoti(AlurPesanRoti.variant);
                Tampilan.jenisPesananVarian.add(Integer.parseInt(Tampilan.getVarianRoti()));
                while(true) {
                    System.out.print("Jumlah Pcs \t\t\t\t\t\t\t\t : ");
                    Tampilan.setJumlahRoti(Tampilan.inputUser.next());
                    if(Integer.parseInt(Tampilan.getJumlahRoti()) <= 0){
                        System.out.println("Input tidak boleh negatif atau nol!");
                    }else{
                        Tampilan.jumlahPesananRoti.add(Integer.parseInt(Tampilan.getJumlahRoti()));
                        Tampilan.kumpulanBiaya.add(Integer.parseInt(Tampilan.getJumlahRoti()) * PcsPizzaVarian1.hitungHargaTotalBulat());
                        break;
                    }
                }
                Tampilan.bahanAdonan.add(format("- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n%s", bahanPizza.totalTepungTerigu(), bahanPizza.totalGulaPasir(), bahanPizza.totalButter(), bahanPizza.totalRagi(), bahanPizza.totalSusuBubuk(), bahanPizza.totalSusuCair(), bahanPizza.totalTelur(), bahanPizza.totalEsBatu(), bahanTopFilPizzav1.totalBahanDibutuhkan()));
                break;
            } else if(AlurPesanRoti.variant.equals("2")){
                System.out.println("Mohon Maaf, untuk sementara varian 2 belum tersedia");
            }else if(AlurPesanRoti.variant.equals("3")){
                System.out.println("Mohon Maaf, untuk sementara varian 3 belum tersedia");
            }else {
                System.out.println("Input tidak boleh 0 atau negatif!");
            }
        }
    }
}
