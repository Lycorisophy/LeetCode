package 基础.内部类;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("eat");
    }

    protected void sit(){
        System.out.println("sit");
    }
}
