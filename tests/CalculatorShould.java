import application.Calculator;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CalculatorShould {
    private Calculator calculator;

    @Before
    public void initialise() {
        calculator = new Calculator();
    }

    @Test public void
    initialise_with_a_value_of_null() {
        assertThat(calculator.getValue(), is(0));
    }

    @Test public void
    add_numbers() {
        List<Integer> numbersToAdd = new ArrayList();
        numbersToAdd.add(1);
        numbersToAdd.add(2);
        numbersToAdd.add(3);
        calculator.add(numbersToAdd);
        assertThat(calculator.getValue(), is(6));
    }

}
