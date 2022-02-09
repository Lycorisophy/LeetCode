package 基础.注解;

/**
 * @author lysoy
 */
public @interface MyAnno {
    // 定义公共的final静态属性
    int age = 25;

    // 定义公共的抽象方法
    String name();
}


