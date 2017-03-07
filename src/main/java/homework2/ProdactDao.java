package homework2;

import oracle.jrockit.jfr.openmbean.ProducerDescriptorType;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by RENT on 2017-02-16.
 */
public class ProdactDao {
    private Set<Product> products = new HashSet<>();

    public void add (Product p){
        products.add(p);
    }
    public Set<Product> getAll(){
        return products;
    }
}
