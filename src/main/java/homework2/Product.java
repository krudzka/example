package homework2;

/**
 * Created by RENT on 2017-02-16.
 */
public class Product {
    private Long id;
    private String catalogNumber;
    private String nazwa;
    public String category;
    private int orderNumber;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (id != null ? !id.equals(product.id) : product.id != null) return false;
        return catalogNumber.equals(product.catalogNumber);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + catalogNumber.hashCode();
        return result;
    }

    Product(Long id, String catalogNumber, String nazwa, String category, int orderNumber) {
        this.id = id;
        this.catalogNumber = catalogNumber;
        this.nazwa = nazwa;
        this.category = category;
        this.orderNumber = orderNumber;
    }



}
