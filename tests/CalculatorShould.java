import application.model.Calculator;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CalculatorShould {
    private Calculator calculator;
    List<String> numbersToPerformOperationOn;

    @Before
    public void initialise() {
        calculator = new Calculator();
        numbersToPerformOperationOn = new ArrayList();
    }

    @Test public void
    add_numbers() {
        numbersToPerformOperationOn.add("1");
        numbersToPerformOperationOn.add("2");
        numbersToPerformOperationOn.add("3");
        assertThat(calculator.add(numbersToPerformOperationOn),is("6"));
    }

    @Test public void
    subtract_numbers(){
        numbersToPerformOperationOn.add("3");
        numbersToPerformOperationOn.add("2");
        assertThat(calculator.subtract(numbersToPerformOperationOn), is("1"));

    }

}
