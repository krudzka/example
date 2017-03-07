package sort;

/**
 * Created by RENT on 2017-02-20.
 */
public class User implements Comparable<User>{
private String name ;
    private String hairColor;
    private Integer height;

    public User(String name, String hairColor, Integer height) {
        this.name = name;
        this.hairColor = hairColor;
        this.height = height;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", height=" + height +
                '}';
    }
    public Integer getHeight(){
        return height;
    }


    @Override
    public int compareTo(User o) {
        return o.name.compareTo(name); // o.name to obiekt do ktorego porownujemy, jak chcemy odwrotna kolejnosc to zmieniamy o.name z name
    }
}
