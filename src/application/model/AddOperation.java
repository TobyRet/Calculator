package application.model;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class AddOperation implements Operation {

    private String total = "";

    @Override
    public String execute(List<String> numbersToAdd) {
        if (numberListContainsDecimal(numbersToAdd)) {
            addDoubles(numbersToAdd);
        } else {
            addIntegers(numbersToAdd);
        }
        return total;
    }

    private boolean numberListContainsDecimal(List<String> numbersToAdd) {
        Boolean outcome = false;
        for(String number : numbersToAdd) {
            if (number.contains(".")) {
                outcome = true;
            }
        }
        return outcome;
    }

    private void addIntegers(List<String> integersToAdd) {
        Integer value = 0;
        for(String number : integersToAdd) {
            value += Integer.parseInt(number);
        }
        total += value.toString();
    }

    private void addDoubles(List<String> doublesToAdd) {
        List<BigDecimal> bigDecimalList = new LinkedList<>();
        for(String number : doublesToAdd) {
            bigDecimalList.add(new BigDecimal(number));
        }
        BigDecimal result = bigDecimalList.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
        result.setScale(BigDecimal.ROUND_HALF_UP);
        total += result.toString();
    }
}
