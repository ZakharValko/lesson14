import java.util.ArrayList;
import java.util.List;

public class Storage<T> {

    private List<? super Book> books = new ArrayList<>();

    public void addAll(List<? extends Book> list){
        books.addAll(list);
    }

}
