import java.math.BigDecimal;

public class Product {
    String name;
    BigDecimal bruttoPrice;
    BigDecimal vat;

    public Product(String name, BigDecimal bruttoPrice, BigDecimal vat) {
        this.name = name;
        this.bruttoPrice = bruttoPrice;
        this.vat = vat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBruttoPrice() {
        return bruttoPrice;
    }

    public void setBruttoPrice(BigDecimal bruttoPrice) {
        this.bruttoPrice = bruttoPrice;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    @Override
    public String toString() {
        return name + " " + bruttoPrice + " " + vat ;
    }
}
