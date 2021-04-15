import java.util.List;

public class GenericBox<T>{

    private List<T> list;

    public GenericBox(List<T> list){
        this.list = list;
    }

    public T get (int index){
        return list.get(index);
    }

    public void add(T value){
        list.add(value);
    }
}
