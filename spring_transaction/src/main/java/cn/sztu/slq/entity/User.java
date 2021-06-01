package cn.sztu.slq.entity;


/**
 * @author qingqing
 * @function:User就是这个被操作对象，里面包含对象的属性，方法，数据结构等
 * @create 2021-01-20-16:51
 */

public class User {
    private Integer id;
    private String realname;
    private String cardno;
    private Integer balance;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", realname='" + realname + '\'' +
                ", cardno='" + cardno + '\'' +
                ", balance=" + balance +
                '}';
    }
}
