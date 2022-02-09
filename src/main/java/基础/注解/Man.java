package 基础.注解;

import java.lang.annotation.Annotation;

/**
 * @author lysoy
 */
@Person(role="CEO")
@Person(role="husband")
@Person(role="father")
@Person(role="son")
public class Man {
    String name="";

    public static void main(String[] args) {
        Annotation[] annotations = Man.class.getAnnotations();
        System.out.println(annotations.length);
        for (Annotation annotation : annotations){
            Persons persons=(Persons) annotation;
            for(Person person: persons.value()){
                System.out.println(person.role());
            }
        }
    }
}


