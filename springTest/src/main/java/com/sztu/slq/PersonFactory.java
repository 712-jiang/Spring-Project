package com.sztu.slq;

/**
 * @author qingqing
 * @function:
 * @create 2021-01-11-16:37
 */
public class PersonFactory {
    public Person creatPersonFactorMethod(){
        Child child = new Child();
        child.setAge(2);
        return child;
    }
}
