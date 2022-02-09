package 设计模式.单例;

//后到先得
public class JingTai {
    private String value;

    public String getValue() {
        return value;
    }

    private void setValue(String value) {
        this.value = value;
    }

    private JingTai() {}

    private class InnerClass{
        private static JingTai clazz = new JingTai();
    }

    public static JingTai getInstance(String name) {
        JingTai clazz = InnerClass.clazz;
        clazz.setValue(name);
        return clazz;
    }
}
