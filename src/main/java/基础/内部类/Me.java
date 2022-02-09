package 基础.内部类;

public class Me extends Person{
    public Myson getMySon(){
        return new Myson();
    }
    public class Myson extends Tool{
        @Override
        public void work() {
            super.work();
        }
    }
    public void work(){
        new Myson().work();
    }
}
