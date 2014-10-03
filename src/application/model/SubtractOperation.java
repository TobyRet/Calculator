package application.model;

import java.util.List;

public class SubtractOperation implements Operation {

    @Override
    public String execute(List<String> numbersToSubtract) {
        Integer value = Integer.parseInt(numbersToSubtract.get(0)) * 2;
        for(String number : numbersToSubtract) {
            value -= Integer.parseInt(number);
        }
        return value.toString();
    }
}
