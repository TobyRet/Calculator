import application.model.AddOperation;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AddOperationShould {
    private AddOperation addOperation;
    List<String> numbersToPerformOperationOn;

    @Before
    public void initialise() {
        addOperation = new AddOperation();
        numbersToPerformOperationOn = new ArrayList();
    }

    @Test public void
    add_integers() {
        createIntegerArray();
        assertThat(addOperation.execute(numbersToPerformOperationOn),is("6"));
    }

    @Test public void
    add_doubles() {
        createDoubleArray();
        assertThat(addOperation.execute(numbersToPerformOperationOn),is("3.66"));
    }

    private void createDoubleArray() {
        numbersToPerformOperationOn.add("1.36");
        numbersToPerformOperationOn.add("2.3");
    }

    private void createIntegerArray() {
        numbersToPerformOperationOn.add("1");
        numbersToPerformOperationOn.add("2");
        numbersToPerformOperationOn.add("3");
    }
}
