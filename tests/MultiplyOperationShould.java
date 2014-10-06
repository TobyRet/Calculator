import application.model.MultiplyOperation;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MultiplyOperationShould {
    private MultiplyOperation multiplyOperation;
    private ArrayList numbersToPerformOperationOn;

    @Before
    public void initialise() {
        multiplyOperation = new MultiplyOperation();
        numbersToPerformOperationOn = new ArrayList();
    }

    @Test
    public void
    multiply_integers() {
        numbersToPerformOperationOn.add("2");
        numbersToPerformOperationOn.add("3");
        assertThat(multiplyOperation.execute(numbersToPerformOperationOn),is("6"));
    }

    @Test public void
    multiply_doubles() {
        numbersToPerformOperationOn.add("2.4");
        numbersToPerformOperationOn.add("3.2");
        assertThat(multiplyOperation.execute(numbersToPerformOperationOn),is("7.68"));
    }
}
