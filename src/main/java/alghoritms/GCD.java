package alghoritms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-02-27.
 */
public class GCD {   // najiekszy wspolny dzielnik sposobem rekurencyjnym
    public static double gcd(double k, double n) {
        if (k == 0) {
            return n;
        } else {
            return gcd(n % k, k);
        }

    }
    //fibonnaci

    public static List<Integer> fib(int x) {
        if (x == 1) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            return list;
        } else if (x == 2) {
                List<Integer> list = new ArrayList<>();
                list.add(1);
                list.add(1);
                return list;
            }
            else{
            List<Integer>  list=new ArrayList<>();
            List<Integer>fibPrevious = fib(x-1);
            int lastElement = list.get(list.size()-1);
            int preLastElement = list.get(list.size()-2);
            int currentElement = lastElement + preLastElement;
            fibPrevious.add(currentElement);
            return fibPrevious;
        }
        }

    }
