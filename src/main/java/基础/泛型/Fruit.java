package 基础.泛型;

public class Fruit<T> extends Generic<T>{
    private T t;
    public Fruit(T t) {
        super(t);
    }

    @Override
    public T getT() {
        return t;
    }

    @Override
    public void setT(T t) {
        this.t = t;
    }

    public T get(){
        return super.getT();
    }
}
