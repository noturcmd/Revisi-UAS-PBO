package AlurProgram;

import Adonan.RotiManis.AdonanRotiManis;
import HargaPcsRoti.*;
import JumlahBahanYangDibutuhkan.BahanYangDibutuhkanRotiManis;

import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import static java.lang.String.format;

public class Tampilan {
    DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
    DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
    static ArrayList<String> bahanTopFill = new ArrayList<>();
    static ArrayList<String> bahanAdonan = new ArrayList<>();

    public static String name;
    private static String varianRoti;
    private static String jumlahRoti;
    private static String jenisRoti;
    int totalHargaSeluruhnya;
    static ArrayList<Integer> kumpulanBiaya = new ArrayList<>();
    static ArrayList<String> jenisPesananRoti = new ArrayList<>();
    static ArrayList<Integer> jenisPesananVarian = new ArrayList<>();
    static ArrayList<Integer> jumlahPesananRoti = new ArrayList<>();

    String yesOrNo;
    static int nominalPembayaran;
    boolean isContinue = true;
    boolean isContinue2 = true;

    public static String getVarianRoti() {
        return varianRoti;
    }

    public static void setVarianRoti(String varianRoti) {
        Tampilan.varianRoti = varianRoti;
    }

    public static String getJumlahRoti() {
        return jumlahRoti;
    }

    public static void setJumlahRoti(String jumlahRoti) {
        Tampilan.jumlahRoti = jumlahRoti;
    }

    public static String getJenisRoti() {
        return jenisRoti;
    }

    static Scanner inputUser = new Scanner(System.in);
    String[][] menu = new String[][]{{"Toko Roti - Dearby", "MENU"},
            {"Roti Manis", "Roti Tawar", "Pizza"}, {"Varian 1", "Varian 2", "Varian 3"},{"Filling : Keju + Coklat", "Filling : Coklat", "Filling : -"}, {"Topping : Coklat", "Topping : -", "Topping : Keju + Sosis + Smoked Beef + Bawang Bombay"}};
    String[][] menu2 = new String[][]{
            {"Filling : Read Bean", "Filling : Keju"}, {"Topping : Krim Vanila", "Topping : -"}, {"Varian 3", "Filling : Keju + Sosis", "Topping : -"}
    };

    public void tampilan(){
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        System.out.println("###########################################################################################################################################################################");
        System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t%s\n",  menu[0][0]);
        System.out.println("__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__-");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t --------");
        System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|  %s  |\n",menu[0][1]);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t --------\n");
        System.out.printf("\t\t\t%s \t\t\t\t\t\t\t\t\t\t\t\t %s \t\t\t\t\t\t\t\t\t\t\t\t %s\n", menu[1][0],menu[1][1],menu[1][2]);
        System.out.println("\t\t------------------\t\t\t\t\t\t\t\t\t\t ------------------\t\t\t\t\t\t\t\t\t\t --------------------");
        System.out.printf("\t\t\t%s\t\t\t\t\t\t\t\t\t\t\t\t %s\t\t\t\t\t\t\t\t\t\t\t\t\t%s\n",menu[2][0], menu[2][0], menu[2][0]);
        System.out.print("\t\t================\t\t\t\t\t\t\t\t\t\t ================\t\t\t\t\t\t\t\t\t\t\t================\n");
        System.out.printf("\t%s\t\t\t\t\t\t\t\t\t%s\t\t\t\t\t\t\t\t\t\t%s\n", menu[3][0], menu[3][1], menu[3][2]);
        System.out.printf("\t%s\t\t\t\t\t\t\t\t\t\t%s\t\t\t\t\t\t\t\t\t\t\t\t%s\n", menu[4][0],menu[4][1],menu[4][2]);
        System.out.printf("\tHarga   : Rp%d\t\t\t\t\t\t\t\t\t\tHarga   : Rp%d\t\t\t\t\t\t\t\t\t\tHarga   : Rp%d\n",PcsRotiManisVarian1.hitungHargaTotalBulat(), PcsRotiManisVarian2.hitungHargaTotalBulat(), PcsRotiManisVarian3.hitungHargaTotalBulat());
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("\t\t\t%s\t\t\t\t\t\t\t\t\t\t\t\t %s\t\t\t\t\t\t\t\t\t\t\t\t[ Tidak Tersedia ]\n", menu[2][1], menu[2][1]);
        System.out.print("\t\t================\t\t\t\t\t\t\t\t\t\t ================\n");
        System.out.printf("\t%s\t\t\t\t\t\t\t\t\t\t%s\n",menu2[0][0], menu2[0][1]);
        System.out.printf("\t%s\t\t\t\t\t\t\t\t\t%s\n", menu2[1][0], menu2[1][1]);
        System.out.printf("\tHarga   : Rp%d\t\t\t\t\t\t\t\t\t\tHarga   : Rp%d\n", PcsRotiTawarVarian1.hitungHargaTotalBulat(), PcsRotiTawarVarian2.hitungHargaTotalBulat());
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("\t\t\t%s\t\t\t\t\t\t\t\t\t\t\t[ Tidak Tersedia ]\t\t\t\t\t\t\t\t\t\t\t[ Tidak Tersedia ]\n", menu[2][2]);
        System.out.print("\t\t================\n");
        System.out.printf("\t%s\n", menu2[2][1]);
        System.out.printf("\t%s\n", menu2[2][2]);
        System.out.printf("\tHarga   : Rp%d\n", PcsPizzaVarian1.hitungHargaTotalBulat());
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        while(true) {
            System.out.print("\nMasukkan nama Anda \t\t\t\t\t\t : ");
            name = inputUser.nextLine();
            if(name.contains("-") || name.contains("~") || name.contains("`")|| name.contains("!")|| name.contains("@")|| name.contains("#")|| name.contains("$")|| name.contains("%")|| name.contains("^")|| name.contains("&")|| name.contains("*")|| name.contains("(")|| name.contains(")")|| name.contains("_")|| name.contains("=")|| name.contains("+")|| name.contains("{")|| name.contains("[")|| name.contains("}")|| name.contains("]")|| name.contains("|")|| name.contains("\\")|| name.contains(";")|| name.contains(":")|| name.contains("\"")|| name.contains("'")|| name.contains("<")|| name.contains(",")|| name.contains(".")|| name.contains(">")|| name.contains("?")|| name.contains("/")){
                System.out.println("Nama harus valid");
            } else if (name.matches(".*\\d+.*")) {
                System.out.println("Nama tidak valid");
            } else{
                break;
            }
        }
        while(true) {
            boolean test = true;
            while(test) {
                System.out.print("Mau Pesan roti apa ? (manis/tawar/pizza) : ");
                Tampilan.jenisRoti = inputUser.next().toLowerCase();
                if(name.contains("-") || name.contains("~") || name.contains("`")|| name.contains("!")|| name.contains("@")|| name.contains("#")|| name.contains("$")|| name.contains("%")|| name.contains("^")|| name.contains("&")|| name.contains("*")|| name.contains("(")|| name.contains(")")|| name.contains("_")|| name.contains("=")|| name.contains("+")|| name.contains("{")|| name.contains("[")|| name.contains("}")|| name.contains("]")|| name.contains("|")|| name.contains("\\")|| name.contains(";")|| name.contains(":")|| name.contains("\"")|| name.contains("'")|| name.contains("<")|| name.contains(",")|| name.contains(".")|| name.contains(">")|| name.contains("?")|| name.contains("/")){
                    System.out.println("Mohon Input jenis roti yang telah tersedia!");
                } else if (Tampilan.jenisRoti.matches(".*\\d+.*")) {
                    System.out.println("Input Anda tidak sesuai dengan jenis Roti yang telah tersedia!");
                } else{
                   test = false;
                }
            }
            if (jenisRoti.equals("manis")) {
                Tampilan.jenisPesananRoti.add(Tampilan.jenisRoti);
                AlurPesanRoti.RotiManis();
            }else if (jenisRoti.equals("tawar")){
                Tampilan.jenisPesananRoti.add(Tampilan.jenisRoti);
                AlurPesanRoti.RotiTawar();
            }else if (jenisRoti.equals("pizza")){
                Tampilan.jenisPesananRoti.add(Tampilan.jenisRoti);
                AlurPesanRoti.Pizza();
            }else {
                System.out.println("Mohon maaf, jenis roti tersebut belum tersedia di toko kami");
            }
            while(isContinue){
                System.out.print("Mau pesan roti lagi ? (Y/N) \t\t\t : ");
                this.yesOrNo = inputUser.next().toLowerCase();
                if(this.yesOrNo.equals("y")){

                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
                    break;
                } else if (!(this.yesOrNo.equals("n")) && !(this.yesOrNo.equals("y"))) {
                    System.out.println("Maaf, input Anda salah");
                }else{
                    isContinue = false;
                    break;
                }
            }
            if(!isContinue) {
                if (kumpulanBiaya.toArray().length == 1) {
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println(Tampilan.name + ", Anda memesan Roti " + Tampilan.getJenisRoti() + ", variant " + Tampilan.getVarianRoti() + ", dengan jumlah " + Tampilan.getJumlahRoti() + " pcs");
                    System.out.printf("Total Bahan : \n%s\n", bahanAdonan.get(0));
                    System.out.println("Harga : " + kursIndonesia.format(Tampilan.kumpulanBiaya.get(0)));
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    while (isContinue2) {
                        System.out.print("Masukkan nominal pembayaran Anda : ");
                        nominalPembayaran = inputUser.nextInt();
                        if(nominalPembayaran < 0){
                            System.out.println("Maaf, Input harus positif!");
                        }else if (nominalPembayaran == 0) {
                            System.out.println("Input Anda 0!");
                        } else if (nominalPembayaran < Tampilan.kumpulanBiaya.get(0)) {
                            System.out.printf("Maaf, Nominal Anda kurang : %s %n", kursIndonesia.format(Math.abs(Tampilan.nominalPembayaran - Tampilan.kumpulanBiaya.get(0))));
                        } else if (nominalPembayaran == Tampilan.kumpulanBiaya.get(0)) {
                            System.out.println("Uang Anda pas!");
                            isContinue2 = false;
                            break;
                        } else {
                            System.out.printf("Uang Anda kembalian : %s %n", kursIndonesia.format(nominalPembayaran - Tampilan.kumpulanBiaya.get(0)));
                            isContinue2 = false;
                            break;
                        }
                    }
                } else if (kumpulanBiaya.toArray().length >= 2) {
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
                    System.out.println(Tampilan.name + ", Anda memesan : ");
                    for (int i = 0; i < jenisPesananRoti.toArray().length; i++) {
                        System.out.printf("=> Roti %s, varian %s, jumlah %d pcs : %s %n", jenisPesananRoti.get(i), jenisPesananVarian.get(i), jumlahPesananRoti.get(i), kursIndonesia.format(Tampilan.kumpulanBiaya.get(i)));
                        System.out.printf("Total Bahan : \n%s\n\n", bahanAdonan.get(i));
                    }
                    for (int hitungHargaTotal : kumpulanBiaya) {
                        this.totalHargaSeluruhnya += hitungHargaTotal;
                    }
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.printf("Total : %s %n", kursIndonesia.format(this.totalHargaSeluruhnya));
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
                    while (isContinue2) {
                        System.out.print("Masukkan nominal pembayaran Anda : ");
                        nominalPembayaran = inputUser.nextInt();
                        if(nominalPembayaran < 0){
                            System.out.println("Maaf, Input harus positif!");
                        } else if (nominalPembayaran == 0) {
                            System.out.println("Input Anda 0!");
                        } else if (nominalPembayaran < totalHargaSeluruhnya) {
                            System.out.printf("Maaf, Nominal Anda kurang : %s %n", kursIndonesia.format(Math.abs(Tampilan.nominalPembayaran - totalHargaSeluruhnya)));
                        } else if (nominalPembayaran == totalHargaSeluruhnya) {
                            System.out.println("Uang Anda pas!");
                            isContinue2 = false;
                        } else {
                            System.out.printf("Uang Anda kembalian : %s %n", kursIndonesia.format(nominalPembayaran - totalHargaSeluruhnya));
                            isContinue2 = false;
                        }
                    }
                }
            }
            if(!isContinue2){
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tTerima kasih, silakan berkunjung kembali :)\n");
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
                break;
            }
        }
    }
}
