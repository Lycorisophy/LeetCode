package 基础.泛型;

public class User {
    private String name;

    public User(){
        this.name = "";
    }
    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
