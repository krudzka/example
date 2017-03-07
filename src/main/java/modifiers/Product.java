package modifiers;

import com.sun.xml.internal.ws.assembler.jaxws.ValidationTubeFactory;

/**
 * Created by RENT on 2017-02-14.
 */
public class Product {

    public static final double  VAT=1.23;
    private String name;
    private String category;
    double price;

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public Double getNetPrice() {
        return price;
    }

    public Double getGrossPrice() {
        return price * VAT;
    }
    public String getName(){
        return name;
    }
    public String getCategory(){
        return category;
    }
}
