package 设计模式.单例;


//后到先得
public class EHan {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private EHan(){};
    private static final EHan clazz = new EHan();
    public static EHan getClazz(int id, String name) {
        clazz.setId(id);
        clazz.setName(name);
        return clazz;
    }

    public static void main(String[] args) {
//        LanHan lanHan1 = LanHan.getLanHan("456");
//        LanHan lanHan2 = LanHan.getLanHan("123");
//        System.out.println(lanHan1.getName());
//        System.out.println(lanHan2.getName());
        JingTai jingTai1 = JingTai.getInstance("123");
        JingTai jingTai2 = JingTai.getInstance("456");
        System.out.println(jingTai1.getValue());
        System.out.println(jingTai2.getValue());
    }
}
