package 基础.泛型;

/**
 * @author lysoy
 */
public class Generic<T> {
    private T t;

    public Generic(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args){
        Generic<Integer> g1 = new Generic<>(123);
        Generic<Generic> g3 = new Generic<>(g1);
        Generic g4 = g3.getT();
        Generic<Generic<Generic>> g5 = new Generic<>(g3);
        Generic<Generic> g6 = g5.getT();
        Generic g7 = g6.getT();
        System.out.println(g1.hashCode());
        System.out.println(g3.hashCode());
        System.out.println(g4.hashCode());
        System.out.println(g5.hashCode());
        System.out.println(g6.hashCode());
        System.out.println(g7.hashCode());

    }
}
