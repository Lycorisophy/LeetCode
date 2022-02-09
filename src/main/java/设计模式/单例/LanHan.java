package 设计模式.单例;


//先到先得
public class LanHan {
    private String name;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
    private LanHan() {}

    private volatile static LanHan lanHan;
    public static LanHan getLanHan(String name) {
        if(lanHan == null){
            synchronized (LanHan.class){
                if (lanHan == null) {
                    lanHan = new LanHan();
                    lanHan.setName(name);
                }
            }
        }
        return lanHan;
    }

    public static void main(String[] args) {
        EHan clazz1 = EHan.getClazz(1,"zs");
        EHan clazz2 = EHan.getClazz(2,"23");
        System.out.println(clazz1.getName());
        System.out.println(clazz2.getName());
    }
}
