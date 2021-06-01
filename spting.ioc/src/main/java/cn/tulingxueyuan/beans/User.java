package cn.tulingxueyuan.beans;

/**
 * @author qingqing
 * @function:
 * @create 2021-01-09-18:28
 */
public class User {
    private Integer id;
    private String username;
    private String reslname;

    public User() {
        System.out.println("User已加载");
    }

    public User(Integer id, String username, String reslname) {
        this.id = id;
        this.username = username;
        this.reslname = reslname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getReslname() {
        return reslname;
    }

    public void setReslname(String reslname) {
        this.reslname = reslname;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", reslname='" + reslname + '\'' +
                '}';
    }
}
