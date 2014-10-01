package application;

import java.util.List;

public class Calculator {
    private Integer value = 0;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void add(List<Integer> numbersToAdd) {
        Integer value = 0;
        for(Integer number : numbersToAdd) {
            value += number;
        }
        setValue(value);
    }
}
