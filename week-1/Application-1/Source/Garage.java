package Source;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Garage {
    public ArrayList<Auto> list = new ArrayList<Auto>();

    public Garage() {
    }

    public Garage(ArrayList<Auto> autos) {
        this.list = autos;
    }

    public void add(Auto auto) {
        list.add(auto);
    }

    public void remove(Auto auto) {
        list.remove(auto);
    }

    public boolean find(Auto auto) {
        return list.contains(auto);
    }

    public void print() {
        System.out.println("В гараже: ");

        for (Auto auto : list)
            System.out.println('\t' + auto.toString());
    }
}
