package 基础.泛型;

public class GeneratorImpl<T> implements Generator<T>{

    @Override
    public T generate(T t) {
        return t;
    }
}
