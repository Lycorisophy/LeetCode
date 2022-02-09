package 基础.注解;

import java.lang.annotation.*;

/**
 * @author lysoy
 */
@Retention(RetentionPolicy.RUNTIME)//注解可以保留到程序运行时，加载到JVM中
@Target(ElementType.TYPE)//给一个类型进行注解，比如类、接口、枚举
@Inherited //子类继承父类时，注解会起作用
public @interface Desc {
    enum Color {
        White, Grayish, Yellow
    }

    // 默认颜色是白色的
    Color c() default Color.White;
}


