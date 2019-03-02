import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class SaleRaport {
    public static void main(String[] args) {
        File file = new File("plik.csv");
        Import importFile = new Import();

        ArrayList<Product> lists = importFile.getImport(file); //zaczyt z pliku
        calculateMethod(lists);
    }


    private static void calculateMethod(ArrayList<Product> lists) {
        BigDecimal sumBrutto = new BigDecimal("0");
        BigDecimal sumNetto = new BigDecimal("0");
        BigDecimal sumVat = new BigDecimal("0");
        BigDecimal one = new BigDecimal("1");

        for (Product list : lists) {
//            System.out.println(list);
            BigDecimal vatFin = list.vat.add(one); //100%+stawka
            BigDecimal nettoPrice = list.bruttoPrice.divide(vatFin, 2, RoundingMode.HALF_UP); //wartość netto
            BigDecimal vatValue = list.bruttoPrice.subtract(nettoPrice);

            sumBrutto = sumBrutto.add(list.bruttoPrice); //suma brutto
            sumNetto = sumNetto.add(nettoPrice); //suma netto
            sumVat = sumVat.add(vatValue);
        }
        System.out.println("Suma brutto: " + sumBrutto);
        System.out.println("Suma netto: " + sumNetto);
        System.out.println("Suma VAT: " + sumVat);
    }
}
