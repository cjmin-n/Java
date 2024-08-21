package classDiagram.model.comparator;

import classDiagram.model.dto.BookDTO;

import java.util.Comparator;

public class DescCategory implements Comparator<BookDTO> {
    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        if (o1.getbNo() < o2.getbNo()){
            return 1;
        }else if(o1.getbNo() > o2.getbNo()) {
            return -1;
        }else {
            return 0;
        }
    }
}
