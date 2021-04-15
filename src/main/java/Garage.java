import java.util.ArrayList;
import java.util.List;

public class Garage<T extends Vehicle> {

    List<T> transport = new ArrayList();

    public T get(int index) {
        return transport.get(index);
    }

    public void add(T element){
        transport.add(element);
    }

    public List getByType(Class classType){
        List<T> result = new ArrayList<>();

        for(T t: transport) {
            if (classType.isInstance(t)){
                transport.add(t);
            }
        }
        return result;
    }
}
