package 基础.枚举;

public enum EnumStudy implements Study{
    MONDAY(1,"周一"),

    SUNDAY(0,"周日") ;

    private int id;
    private String value;

    EnumStudy(int id, String value) {
        this.id = id;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void study() {
        System.out.println(getValue());
    }

    public static void main(String[] args) {
        SUNDAY.study();
        MONDAY.study();
    }
}
