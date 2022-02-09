package 基础.注解;

import java.lang.annotation.Repeatable;

/**
 * @author lysoy
 */
@Repeatable(Persons.class)
public @interface Person{
    String role() default "";
}

