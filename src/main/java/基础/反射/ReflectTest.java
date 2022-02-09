package 基础.反射;

import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileReader("Class.txt"));

        String classname = properties.getProperty("classname");
        String methodname = properties.getProperty("methodname");

        Class<?> clazz = Class.forName(classname);
        Method method = clazz.getMethod(methodname);
        method.invoke(clazz.newInstance());
    }
}


