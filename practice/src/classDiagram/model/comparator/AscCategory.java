package classDiagram.model.comparator;

import java.util.Comparator;

public class AscCategory implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 < o2){
            return -1;
        }else if(o1 > o2) {
            return 1;
        }else {
            return 0;
        }
    }
}
