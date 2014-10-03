package application.model;

import java.util.List;

public class AddOperation implements Operation {

    @Override
    public String execute(List<String> numbersToAdd) {
        Integer value = 0;
        for(String number : numbersToAdd) {
            value += Integer.parseInt(number);
        }
        return value.toString();
    }
}
