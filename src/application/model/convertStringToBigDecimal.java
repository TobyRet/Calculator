package application.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ConvertStringToBigDecimal {

    public static List<BigDecimal> convert(List<String> numbersToOperateOn) {
        List<BigDecimal> bigDecimalList = new ArrayList<>();
        for(String number : numbersToOperateOn) {
            bigDecimalList.add(new BigDecimal(number));
        }
        return bigDecimalList;
    }
}
