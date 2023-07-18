package Variant;

public interface VariantRoti {
    double hargaVariant1();
    default double hargaVariant2(){
        return 0;
    }
    default double hargaVariant3(){
        return 0;
    }
}
