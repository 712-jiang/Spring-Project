package com.sztu.slq;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.sound.midi.SoundbankResource;
import java.util.List;
import java.util.Map;

/**
 * @author qingqing
 * @function:
 * @create 2021-01-11-12:07
 */
public class Person implements InitializingBean, DisposableBean {
    private Integer age;
    private String name;
    private String job;
    private Wife wife;
    private List<String> hobbies;
    private Map<Integer, String> course;

    public Person() {
        System.out.println("person创建");
    }



    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Map<Integer, String> getCourse() {
        return course;
    }

    public void setCourse(Map<Integer, String> course) {
        this.course = course;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", wife=" + wife +
                ", hobbies=" + hobbies +
                ", course=" + course +
                '}';
    }

    public static Person creatPersonFactor() {
        Child child = new Child();
        child.setAge(1);
        return child;
    }

    public void destroy() throws Exception {
        System.out.println("销毁");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("实例化");
    }

    public void destroyMethod() throws Exception {
        System.out.println("销毁1");
    }

    public void initMethod() throws Exception {
        System.out.println("实例化1");
    }
}
