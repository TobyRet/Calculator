package application.model;

import java.util.List;

public class Calculator {

    public String add(List<String> numbersToAdd) {
        Integer value = 0;
        for(String number : numbersToAdd) {
            value += Integer.parseInt(number);
        }
        return value.toString();
    }

    public String subtract(List<String> numbersToSubtract) {
        Integer value = Integer.parseInt(numbersToSubtract.get(0)) * 2;
        for(String number : numbersToSubtract) {
            value -= Integer.parseInt(number);
        }
        return value.toString();
    }
}
