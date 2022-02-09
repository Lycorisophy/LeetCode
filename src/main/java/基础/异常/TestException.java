package 基础.异常;
/**
 * 测试异常
 */
public class TestException {

    @org.junit.Test
    public void test(){
        UseMyException ex = new UseMyException("admin","123");
        try{
            ex.throwException("1234");
        }catch (MyException me){
            System.out.println("MyException:"+me.getMessage());
        }
    }
}
