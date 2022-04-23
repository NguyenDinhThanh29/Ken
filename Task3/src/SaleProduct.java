public class SaleProduct {
    public static void main(String[] args) {
        float Banh = 30000;
        float Nuoc =  10000;
        float Kimchi = 150000;
        float Gao = 200000;
        float ComChay = 50000;
        int SL1 = 4;
        int SL2 = 6;
        int SL3 = 5;
        int SL4 = 6;
        int SL5 = 7;
        float total;
        total = Banh*SL1 + Nuoc*SL2 + Kimchi*SL3 + Gao*SL4 + ComChay*SL5;
        System.out.println("Total");
        System.out.println(total);
    }
}
