package 基础.泛型;

import java.io.Serializable;

public interface Generator<T> extends Serializable {
    public T generate(T t);
}
