package Bahan;

public interface BAHAN {
    double tepungTerigu();
    double gulaPasir();
    double butter();
    double ragi();
    double susuBubuk();
    double susuCair();
    double telur();
    double esBatu();
    default double totalGramResep(){
        return 0;
    }


}
