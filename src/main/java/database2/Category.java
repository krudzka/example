package database2;

/**
 * Created by RENT on 2017-02-16.
 */
public class Category {

    Long id;
    String name;
    Category(Long id, String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        return id.equals(category.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
