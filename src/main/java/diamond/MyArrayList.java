package diamond;


/**
 * Created by RENT on 2017-02-18.
 */
@SuppressWarnings("unchecked")
public class MyArrayList<T> { // tego T mozemy uzywac wszedzie jakos typ klasy ktorego nie znamy


    public Object values[];
    public int currentIndex = 0;

    public void add(T t) {
        values[currentIndex] = t;
        currentIndex++;
        if (currentIndex > values.length) {
            Object[] newValues = new Object[values.length + 100];
            System.arraycopy(values, 0, newValues, 0, values.length);
            values = newValues;
        }
    }

    public T get(int index) {

        if (index > currentIndex) {
            throw new BadIndex(size(), index);
        }

        return (T) values[index];
    }


    public int size() {
        return currentIndex;
    }

    public boolean isEmpty() {
        return values == null;

    }

    public boolean contains(T t) {
        for (int i = 0; i < values.length; i++) {
            if (t == values[i])
                return true;
        }
        return false;
    }

    public int IndexOf(T t) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == t)
                return i;

        }
        return -1;
    }

    public int lastIndexOf(T t) {
        for (int i = values.length; i <= 0; i--) {
            if (values[i] == t)
                return i;


        }
        return -1;
    }


    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("Podaj index");
                new MyArrayList<>().get(100);
                break;
            } catch (BadIndex e) {
                System.out.println("Podałeś zły index. Wiadomość: " + e.getMessage());
            }
        }
    }
}







