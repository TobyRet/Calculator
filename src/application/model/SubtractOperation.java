package application.model;

//public class SubtractOperation implements Operation {
//
//    private String total ="";

//    @Override
//    public String execute(List<String> numbersToSubtract) {
//        if (numberListContainsDecimal(numbersToSubtract)) {
//            subtractDoubles(numbersToSubtract);
//        } else {
//            subtractIntegers(numbersToSubtract);
//        }
//        return total;
//    }
//
//    private void subtractIntegers(List<String> numbersToSubtract) {
//        Integer value = Integer.parseInt(numbersToSubtract.get(0)) * 2;
//            for(String number : numbersToSubtract) {
//                value -= Integer.parseInt(number);
//            }
//            total += value.toString();
//    }
//
//    private void subtractDoubles(List<String> doublesToSubtract) {
//        List<BigDecimal> bigDecimalList = convertToBigDecimal(doublesToSubtract);
//
//        for(BigDecimal number : bigDecimalList) {
//
//            BigDecimal subtractFromStartingValue = new BigDecimal((bigDecimalList.get(0).add(bigDecimalList.get(0))).toString());
//            result -= number;
//        }
//
////        BigDecimal result = bigDecimalList.stream().reduce(BigDecimal.ZERO,BigDecimal::subtract);
////        result.setScale(BigDecimal.ROUND_HALF_UP);
//        total += result.toString();
//    }
//
//    private List<BigDecimal> convertToBigDecimal(List<String> doublesToSubtract) {
//        List<BigDecimal> bigDecimalList = new LinkedList<>();
//        for(String number : doublesToSubtract) {
//            bigDecimalList.add(new BigDecimal(number));
//        }
//        return bigDecimalList;
//    }
//
//    private boolean numberListContainsDecimal(List<String> numbersToSubtract) {
//        boolean outcome = false;
//        for(String number : numbersToSubtract) {
//            if(number.contains(".")){
//                outcome = true;
//            }
//        }
//        return outcome;
//    }
//}
