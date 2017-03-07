package database2;

import java.util.*;

/**
 * Created by RENT on 2017-02-16.
 */
public class ProductCategoryDao {
    private Map<Category, List<Product>> categoryToProducts = new HashMap<>();

    public void add(Product p) {
        categoryToProducts.putIfAbsent(p.getCategory(), new ArrayList<>());
        //  if (!categoryToProducts.containsKey(p.getCategory()))
        //     categoryToProducts.put(p.getCategory(), new ArrayList<>()); // ten if jest zastapiany ifAbsent na gorze

        List<Product> products = categoryToProducts.get(p.getCategory());
        products.add(p);
    }

    public List<Product> findByCategory(Category category) {
        List<Product> products = categoryToProducts.get(category);
        return products;
    }

    public Set<Product> getAll() {
        Set<Product> all = new HashSet<>();
        Collection<List<Product>> values = categoryToProducts.values(); // lista list wiec zwroci wszystkie produkty wszystkich kategorii

        for (List<Product> products : values) {
            for (Product product : products) {
                all.add(product); //
            }//                         all.addAll(products); // dodaje dwie kolekcje mozna go wrzucic zamiast tej srodkowje petli
        }
        return all;
    }
}

