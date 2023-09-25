package org.launchcode;
import java.util.Comparator;

public class ToppingComparator implements Comparator<Topping>{
    @Override
    public int compare(Topping o1, Topping o2) {
        if (o1.getCost() - o2.getCost() > 0) {
            return -1;
        } else if (o1.getCost() - o2.getCost() < 0) {
            return 1;
        } else return 0;
    }
}
