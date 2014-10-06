package application.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AddOperation implements Operation {

    private String total = "";

    @Override
    public String execute(List<String> numbersToAdd) {
        return add(convertStringToBigDecimal(numbersToAdd));
    }

    private String add(List<BigDecimal> bigDecimals) {
        BigDecimal result = bigDecimals.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
        result.setScale(BigDecimal.ROUND_HALF_UP);
        return total += result.toString();
    }

    private List<BigDecimal> convertStringToBigDecimal(List<String> numbersToAdd) {
        List<BigDecimal> bigDecimalList = new ArrayList<>();
        for(String number : numbersToAdd) {
            bigDecimalList.add(new BigDecimal(number));
        }
        return bigDecimalList;
    }
}
