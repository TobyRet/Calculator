package application.model;

import java.math.BigDecimal;
import java.util.List;

public class DivideOperation implements Operation {
    private String total = "";

    @Override
    public String execute(List<String> numbersToDivide) {
        return divide(ConvertStringToBigDecimal.convert(numbersToDivide));
    }

    private String divide(List<BigDecimal> numbersToDivide) {
        BigDecimal firstValue = numbersToDivide.get(0);
        BigDecimal startingValue = firstValue.multiply(firstValue);
        for(BigDecimal number : numbersToDivide) {
            startingValue = startingValue.divide(number);
        }
        return total = startingValue.toString();
    }
}
