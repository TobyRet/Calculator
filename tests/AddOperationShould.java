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
        numbersToPerformOperationOn.add("1");
        numbersToPerformOperationOn.add("2");
        numbersToPerformOperationOn.add("3");
        assertThat(addOperation.execute(numbersToPerformOperationOn),is("6"));
    }

    @Test public void
    add_doubles() {
        numbersToPerformOperationOn.add("1.3");
        numbersToPerformOperationOn.add("2.3");
        assertThat(addOperation.execute(numbersToPerformOperationOn),is("3.6"));
    }
}
