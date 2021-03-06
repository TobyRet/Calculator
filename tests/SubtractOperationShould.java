import application.model.SubtractOperation;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SubtractOperationShould {

    private SubtractOperation subtractOperation;
    List<String> numbersToPerformOperationOn;

    @Before
    public void initialise() {
        subtractOperation = new SubtractOperation();
        numbersToPerformOperationOn = new ArrayList();
    }

    @Test
    public void
    subtract_integers(){
        createIntegerArray();
        assertThat(subtractOperation.execute(numbersToPerformOperationOn), is("2"));
    }

    @Test public void
    subtract_doubles() {
        numbersToPerformOperationOn.add("3.2");
        numbersToPerformOperationOn.add("2.1");
        assertThat(subtractOperation.execute(numbersToPerformOperationOn), is("1.1"));
    }

    private void createIntegerArray() {
        numbersToPerformOperationOn.add("5");
        numbersToPerformOperationOn.add("2");
        numbersToPerformOperationOn.add("1");
    }
}
