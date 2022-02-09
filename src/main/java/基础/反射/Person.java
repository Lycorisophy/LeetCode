package 基础.反射;

public class Person {
    private int id;
    private String name;

    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void getPerson(){
        System.out.println("i am a person.");
    }
}


