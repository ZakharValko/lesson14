public class GenericType<T> {

    private T t;

    public GenericType(T t){
        this.t = t;
    }

    public T get(){
        return t;
    }

    public T set(T t){
        this.t = t;
        return this.t;
    }
}
