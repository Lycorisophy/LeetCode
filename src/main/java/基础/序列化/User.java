package 基础.序列化;

import java.io.*;

/**
 * @author lysoy
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String username;
    private transient String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //序列化
    public static void SerializeUser(File file, String username, String password) throws IOException {
        User user = new User(username, password);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(user);
        oos.close();
        System.out.println("普通字段序列化：username=  "+user.getUsername());
        System.out.println("添加了transient关键字序列化：password=  "+user.getPassword());
    }

    //反序列化
    public static User DeSerializeUser(File file) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        return  (User)ois.readObject();
    }
}
