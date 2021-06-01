package cn.sztu.slq.Proxy.deniamic;

/**
 * @author qingqing
 * @function:
 * @create 2021-01-17-14:46
 */
public class Calculator implements ICalculator {
    public Integer add(Integer i, Integer j) {
        Integer result = i+j;
        return result;
    }
}
