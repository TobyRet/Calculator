package application.model;

import java.util.List;

public class MultiplyOperation implements Operation {
    @Override
    public String execute(List<String> numbersToMultiply) {
        Integer value = 1;
        for(String number : numbersToMultiply) {
            value *= Integer.parseInt(number);
        }
        return value.toString();
    }
}
