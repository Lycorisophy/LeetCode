package 基础.泛型;

public class FruitGenerator implements Generator<Fruit<String>>{

    @Override
    public Fruit<String> generate(Fruit<String> stringFruit) {
        System.out.println(stringFruit.getT());
        return new Fruit<>("123");
    }

    public static void main(String[] args) {
        FruitGenerator fruitGenerator = new FruitGenerator();
        Fruit<String> fruit = fruitGenerator.generate(new Fruit<>("123"));
        System.out.println(fruit.get());
    }
}
