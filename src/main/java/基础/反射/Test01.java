package 基础.反射;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test01 {
    public static void main(String[] args) throws Exception {
        //获得class对象
        //通过构造器创建对象
        Class c1 = Class.forName("基础.反射.User");
        Constructor constructor = c1.getDeclaredConstructor();
        User user = (User) constructor.newInstance();
        user.setName("123");
        System.out.println(user.getName());
    }
}

