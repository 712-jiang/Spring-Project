package cn.sztu.slq.Beans;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author qingqing
 * @function:
 * @create 2021-01-16-16:55
 */
public class Job {
    @Value("钱多多")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
