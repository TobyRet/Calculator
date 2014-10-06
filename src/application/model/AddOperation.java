package application.model;

import java.math.BigDecimal;
import java.util.List;

public class AddOperation implements Operation {

    private String total = "";

    @Override
    public String execute(List<String> numbersToAdd) {
        return add(ConvertStringToBigDecimal.convert(numbersToAdd));
    }

    private String add(List<BigDecimal> bigDecimals) {
        BigDecimal result = bigDecimals.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
        result.setScale(BigDecimal.ROUND_HALF_UP);
        return total += result.toString();
    }
}
