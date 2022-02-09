package 基础.泛型;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Object o = getInstance(Class.forName("基础.泛型.User"));
        System.out.println(o);
    }

    public static <T> T getInstance(Class<T> clazz) throws InstantiationException, IllegalAccessException {
        T t = clazz.newInstance();
        return t;
    }
}
