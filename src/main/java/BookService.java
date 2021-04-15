import java.util.ArrayList;
import java.util.List;

public class BookService {
    public static void main(String[] args) {
        List<Album> albumSource = new ArrayList<>();
        List<Album> albumDestination = new ArrayList<>();
        List<Book> booksDestination = new ArrayList<>();
        List<Book> booksSource = new ArrayList<>();
        copyToBooks(albumSource, booksDestination);
        copyToBooks(albumSource, albumDestination);
        copyToBooks(booksSource, booksDestination);
    }

    public static <T> void copyToBooks (List<? extends T> src, List<? super T> dest){
        for(T t : src) { dest.add(t); }
    }
}
