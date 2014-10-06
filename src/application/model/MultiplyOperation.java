package application.model;

import java.math.BigDecimal;
import java.util.List;

public class MultiplyOperation implements Operation {
    private String total = "";

    @Override
    public String execute(List<String> numbersToMultiply) {
        return multiply(ConvertStringToBigDecimal.convert(numbersToMultiply));
    }

    private String multiply(List<BigDecimal> numbersToMultiply) {
        BigDecimal startingValue = new BigDecimal("1");
        for(BigDecimal number : numbersToMultiply) {
            startingValue = startingValue.multiply(number);
        }
        return total = startingValue.toString();
    }
}
