import java.rmi.NoSuchObjectException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        GenericType<String> object1 = new GenericType<>("Hello");
        GenericType<Integer> object2 = new GenericType<>(100);

        Storage<Book> storage = new Storage<>();
        List<Album> albums = new ArrayList<>();
        storage.addAll(albums);
    }
}
