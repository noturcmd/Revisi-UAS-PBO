package AlurProgram;

import HargaPcsRoti.*;
import JumlahBahanYangDibutuhkan.*;

import java.util.ArrayList;

import static AlurProgram.Tampilan.*;
import static java.lang.String.format;


public class AlurPesanRoti {
    static String variant;
    static boolean isContinue4 = true;
    static boolean isContinue5 = true;
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
        while(isContinue) {
            System.out.print("Varian \t\t\t\t\t\t\t\t\t : ");
            AlurPesanRoti.variant = Tampilan.inputUser.next();
            if (!(AlurPesanRoti.variant.equals("1")) && !(AlurPesanRoti.variant.equals("2")) && !(AlurPesanRoti.variant.equals("3"))) {
                System.out.println("Maaf, Input Anda salah");
                jenisPesananRoti.remove("manis");
                Tampilan.inputContinue2();
            } else if (AlurPesanRoti.variant.matches("[a-zA-Z]+")) {
                System.out.println("Maaf, harus inputan Angka!");
            } else if (AlurPesanRoti.variant.equals("1")) {
                Tampilan.setVarianRoti(AlurPesanRoti.variant);
                Tampilan.jenisPesananVarian.add(Integer.parseInt(Tampilan.getVarianRoti()));
                if(isContinue5 == false){
                    isContinue5 = true;
                }
                while(isContinue5) {
                    System.out.print("Jumlah Pcs \t\t\t\t\t\t\t\t : ");
                    Tampilan.setJumlahRoti(Tampilan.inputUser.next());
                    if(Integer.parseInt(Tampilan.getJumlahRoti()) <= 0){
                        System.out.println("Input tidak boleh negatif atau nol!");
                    }else if(Tampilan.getJumlahRoti().matches("[a-zA-Z]+")){
                        System.out.println("Input jumlah harus angka!");
                    }else{
                        isContinue5 = false;
                    }
                }
                Tampilan.jumlahPesananRoti.add(Integer.parseInt(Tampilan.getJumlahRoti()));
                Tampilan.kumpulanBiaya.add(Long.parseLong(Tampilan.getJumlahRoti()) * PcsRotiManisVarian1.hitungHargaTotalBulat());
                Tampilan.bahanAdonan.add(format("- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n%s", bahanRotiManis.totalTepungTerigu(), bahanRotiManis.totalGulaPasir(), bahanRotiManis.totalButter(), bahanRotiManis.totalRagi(), bahanRotiManis.totalSusuBubuk(), bahanRotiManis.totalSusuCair(), bahanRotiManis.totalTelur(), bahanRotiManis.totalEsBatu(), bahanTopfilRotmanv1.totalBahanDibutuhkan()));
                inputContinue2();
            } else if (AlurPesanRoti.variant.equals("2")) {
                Tampilan.setVarianRoti(AlurPesanRoti.variant);
                Tampilan.jenisPesananVarian.add(Integer.parseInt(Tampilan.getVarianRoti()));
                if(isContinue5 == false){
                    isContinue5 = true;
                }
                while(isContinue5) {
                    System.out.print("Jumlah Pcs \t\t\t\t\t\t\t\t : ");
                    Tampilan.setJumlahRoti(Tampilan.inputUser.next());
                    if(Integer.parseInt(Tampilan.getJumlahRoti()) <= 0){
                        System.out.println("Input tidak boleh negatif atau nol!");
                    }else if(Tampilan.getJumlahRoti().matches("[a-zA-Z]+")){
                        System.out.println("Input harus angka!");
                    }else{
                        isContinue5 = false;
                    }
                }
                Tampilan.jumlahPesananRoti.add(Integer.parseInt(Tampilan.getJumlahRoti()));
                Tampilan.kumpulanBiaya.add(Long.parseLong(Tampilan.getJumlahRoti()) * PcsRotiManisVarian2.hitungHargaTotalBulat());
                Tampilan.bahanAdonan.add(format("- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n%s", bahanRotiManis.totalTepungTerigu(), bahanRotiManis.totalGulaPasir(), bahanRotiManis.totalButter(), bahanRotiManis.totalRagi(), bahanRotiManis.totalSusuBubuk(), bahanRotiManis.totalSusuCair(), bahanRotiManis.totalTelur(), bahanRotiManis.totalEsBatu(), bahanTopfilRotmanv2.totalBahanDibutuhkan()));
                inputContinue2();
            } else if(AlurPesanRoti.variant.equals("3")){
                Tampilan.setVarianRoti(AlurPesanRoti.variant);
                Tampilan.jenisPesananVarian.add(Integer.parseInt(Tampilan.getVarianRoti()));
                if(isContinue5 == false){
                    isContinue5 = true;
                }
                while(isContinue5) {
                    System.out.print("Jumlah Pcs \t\t\t\t\t\t\t\t : ");
                    Tampilan.setJumlahRoti(Tampilan.inputUser.next());
                    if(Integer.parseInt(Tampilan.getJumlahRoti()) <= 0){
                        System.out.println("Input tidak boleh negatif atau nol!");
                    }else if(Tampilan.getJumlahRoti().matches("[a-zA-Z]+")){
                        System.out.println("Input harus angka!");
                    }else{
                        isContinue5 = false;
                    }
                }
                Tampilan.jumlahPesananRoti.add(Integer.parseInt(Tampilan.getJumlahRoti()));
                Tampilan.kumpulanBiaya.add(Long.parseLong(Tampilan.getJumlahRoti()) * PcsRotiManisVarian3.hitungHargaTotalBulat());
                Tampilan.bahanAdonan.add(format("- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n%s", bahanRotiManis.totalTepungTerigu(), bahanRotiManis.totalGulaPasir(), bahanRotiManis.totalButter(), bahanRotiManis.totalRagi(), bahanRotiManis.totalSusuBubuk(), bahanRotiManis.totalSusuCair(), bahanRotiManis.totalTelur(), bahanRotiManis.totalEsBatu(), bahanTopfilRotmanv3.totalBahanDibutuhkan()));
                inputContinue2();
            }else {
                System.out.println("Input tidak boleh 0 atau negatif!");
            }break;
        }
    }
    public static void  RotiTawar() {
        while(isContinue4) {
            System.out.print("Varian \t\t\t\t\t\t\t\t\t : ");
            AlurPesanRoti.variant = Tampilan.inputUser.next();
            if (!(AlurPesanRoti.variant.equals("1")) && !(AlurPesanRoti.variant.equals("2")) && !(AlurPesanRoti.variant.equals("3"))) {
                System.out.println("Maaf, Input Anda salah!");
                jenisPesananRoti.remove("tawar");
                Tampilan.inputContinue2();
            } else if (AlurPesanRoti.variant.equals("1")) {
                Tampilan.setVarianRoti(AlurPesanRoti.variant);
                Tampilan.jenisPesananVarian.add(Integer.parseInt(Tampilan.getVarianRoti()));
                if(isContinue5 == false){
                    isContinue5 = true;
                }
                while(isContinue5) {
                    System.out.print("Jumlah Pcs \t\t\t\t\t\t\t\t : ");
                    Tampilan.setJumlahRoti(Tampilan.inputUser.next());
                    if(Integer.parseInt(Tampilan.getJumlahRoti()) <= 0){
                        System.out.println("Input tidak boleh negatif atau nol!");
                    }else if(Tampilan.getJumlahRoti().matches("[a-zA-Z]+")){
                        System.out.println("Input harus angka!");
                    }else{
                        isContinue5 = false;
                    }
                }
                Tampilan.jumlahPesananRoti.add(Integer.parseInt(Tampilan.getJumlahRoti()));
                Tampilan.kumpulanBiaya.add(Long.parseLong(Tampilan.getJumlahRoti()) * PcsRotiTawarVarian1.hitungHargaTotalBulat());
                Tampilan.bahanAdonan.add(format("- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n%s", bahanRotiManis.totalTepungTerigu(), bahanRotiManis.totalGulaPasir(), bahanRotiManis.totalButter(), bahanRotiManis.totalRagi(), bahanRotiManis.totalSusuBubuk(), bahanRotiManis.totalSusuCair(), bahanRotiManis.totalTelur(), bahanRotiManis.totalEsBatu(), bahanTopfilRotmanv3.totalBahanDibutuhkan()));
                inputContinue2();
            } else if (AlurPesanRoti.variant.equals("2")) {
                Tampilan.setVarianRoti(AlurPesanRoti.variant);
                Tampilan.jenisPesananVarian.add(Integer.parseInt(Tampilan.getVarianRoti()));
                if(isContinue5 == false){
                    isContinue5 = true;
                }
                while(isContinue5) {
                    System.out.print("Jumlah Pcs \t\t\t\t\t\t\t\t : ");
                    Tampilan.setJumlahRoti(Tampilan.inputUser.next());
                    if(Integer.parseInt(Tampilan.getJumlahRoti()) <= 0){
                        System.out.println("Input tidak boleh negatif atau nol!");
                    }else if(Tampilan.getJumlahRoti().matches("[a-zA-Z]+")){
                        System.out.println("Input harus angka!");
                    }else{
                        isContinue5 = false;
                    }
                }
                Tampilan.jumlahPesananRoti.add(Integer.parseInt(Tampilan.getJumlahRoti()));
                Tampilan.kumpulanBiaya.add(Long.parseLong(Tampilan.getJumlahRoti()) * PcsRotiTawarVarian2.hitungHargaTotalBulat());
                Tampilan.bahanAdonan.add(format("- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n%s", bahanRotiManis.totalTepungTerigu(), bahanRotiManis.totalGulaPasir(), bahanRotiManis.totalButter(), bahanRotiManis.totalRagi(), bahanRotiManis.totalSusuBubuk(), bahanRotiManis.totalSusuCair(), bahanRotiManis.totalTelur(), bahanRotiManis.totalEsBatu(), bahanTopfilRotmanv3.totalBahanDibutuhkan()));
                inputContinue2();
            } else if(AlurPesanRoti.variant.equals("3")){
                System.out.println("Mohon Maaf, untuk sementara varian 3 belum tersedia");
                jenisPesananRoti.remove("tawar");
                inputContinue2();
            }else {
                System.out.println("Input tidak boleh 0 atau negatif!");
            }
            break;
        }
    }
    public static void Pizza() {
        while(isContinue4) {
            System.out.print("Varian \t\t\t\t\t\t\t\t\t : ");
            AlurPesanRoti.variant = Tampilan.inputUser.next();
            if (!(AlurPesanRoti.variant.equals("1")) && !(AlurPesanRoti.variant.equals("2")) && !(AlurPesanRoti.variant.equals("3"))) {
                System.out.println("Maaf, Input Anda salah!");
                jenisPesananRoti.remove("pizza");
                Tampilan.inputContinue2();
            } else if (AlurPesanRoti.variant.equals("1")) {
                Tampilan.setVarianRoti(AlurPesanRoti.variant);
                Tampilan.jenisPesananVarian.add(Integer.parseInt(Tampilan.getVarianRoti()));
                if(isContinue5 == false){
                    isContinue5 = true;
                }
                while(isContinue5) {
                    System.out.print("Jumlah Pcs \t\t\t\t\t\t\t\t : ");
                    Tampilan.setJumlahRoti(Tampilan.inputUser.next());
                    if(Integer.parseInt(Tampilan.getJumlahRoti()) <= 0){
                        System.out.println("Input tidak boleh negatif atau nol!");
                    }else if(Tampilan.getJumlahRoti().matches("[a-zA-Z]+")){
                        System.out.println("Input harus angka!");
                    }else{
                        isContinue5 = false;
                    }
                }
                Tampilan.jumlahPesananRoti.add(Integer.parseInt(Tampilan.getJumlahRoti()));
                Tampilan.kumpulanBiaya.add(Long.parseLong(Tampilan.getJumlahRoti()) * PcsPizzaVarian1.hitungHargaTotalBulat());
                Tampilan.bahanAdonan.add(format("- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n- %s\n%s", bahanRotiManis.totalTepungTerigu(), bahanRotiManis.totalGulaPasir(), bahanRotiManis.totalButter(), bahanRotiManis.totalRagi(), bahanRotiManis.totalSusuBubuk(), bahanRotiManis.totalSusuCair(), bahanRotiManis.totalTelur(), bahanRotiManis.totalEsBatu(), bahanTopfilRotmanv3.totalBahanDibutuhkan()));
                inputContinue2();
            } else if(AlurPesanRoti.variant.equals("2")){
                System.out.println("Mohon Maaf, untuk sementara varian 2 belum tersedia");
                jenisPesananRoti.remove("pizza");
                inputContinue2();
            }else if(AlurPesanRoti.variant.equals("3")){
                System.out.println("Mohon Maaf, untuk sementara varian 3 belum tersedia");
                jenisPesananRoti.remove("pizza");
                inputContinue2();
            }else {
                System.out.println("Input tidak boleh 0 atau negatif!");
            }
            break;
        }
    }


}
