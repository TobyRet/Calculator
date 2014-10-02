package application.model;

import java.util.List;

public class Calculator {
    private Integer value = 0;

    /*public Integer getValue() {
        return value;
    }*/

    /*public void setValue(Integer value) {
        this.value = value;
    }*/

    public String add(List<String> numbersToAdd) {
        Integer value = 0;
        for(String number : numbersToAdd) {
            value += Integer.parseInt(number);
        }
        return value.toString();
    }
}
