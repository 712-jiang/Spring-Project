package com.sztu.slq;

/**
 * @author qingqing
 * @function:
 * @create 2021-01-11-12:15
 */
public class Wife {
    private String name;
    private Integer age;

    public Wife() {
        System.out.println("wife已加载");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
