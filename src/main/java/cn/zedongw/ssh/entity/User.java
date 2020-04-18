package cn.zedongw.ssh.entity;

/**
 * @ClassName User
 * @Description: 用户实体类
 * @Author ZeDongW
 * @Date 2020/4/17 0017 9:43
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class User {
    private int id;
    private String userName;
    private int age;

    public User() {
    }

    public User(int id, String userName, int age) {
        this.id = id;
        this.userName = userName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }
}
