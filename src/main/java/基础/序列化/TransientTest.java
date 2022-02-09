package 基础.序列化;

import java.io.*;


public class TransientTest {
    public static void main(String[] args) {
        File file = new File("data.txt");
        try {
            User.SerializeUser(file, "素小暖", "123456");
            User user = User.DeSerializeUser(file);
            System.out.println(user.getUsername());
            System.out.println(user.getPassword());
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}

