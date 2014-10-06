package application.model;

import java.math.BigDecimal;
import java.util.List;

public class SubtractOperation implements Operation {

    private String total ="";

    @Override
    public String execute(List<String> numbersToSubtract) {
        return subtract(ConvertStringToBigDecimal.convert(numbersToSubtract));
    }

    private String subtract(List<BigDecimal> numbersToSubtract) {
        BigDecimal firstValueInArray = numbersToSubtract.get(0);
        BigDecimal startValue = firstValueInArray.add(firstValueInArray);
        for(BigDecimal number : numbersToSubtract) {
            startValue = startValue.subtract(number);
        }
        return total = startValue.toString();
    }
}
