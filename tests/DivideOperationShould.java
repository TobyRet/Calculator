import application.model.DivideOperation;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DivideOperationShould {

    private DivideOperation divideOperation;
    private ArrayList numbersToPerformOperationOn;

    @Before
    public void initialise() {
        divideOperation = new DivideOperation();
        numbersToPerformOperationOn = new ArrayList();
    }

    @Test
    public void
    divide_integers() {
        numbersToPerformOperationOn.add("6");
        numbersToPerformOperationOn.add("3");
        assertThat(divideOperation.execute(numbersToPerformOperationOn),is("2"));
    }

    @Test public void
    multiply_doubles() {
        numbersToPerformOperationOn.add("2.4");
        numbersToPerformOperationOn.add("3.2");
        assertThat(divideOperation.execute(numbersToPerformOperationOn),is("0.75"));
    }
}
