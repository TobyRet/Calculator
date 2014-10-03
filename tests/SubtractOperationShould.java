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

    @Test public void
    subtract_numbers(){
        numbersToPerformOperationOn.add("3");
        numbersToPerformOperationOn.add("2");
        assertThat(subtractOperation.execute(numbersToPerformOperationOn), is("1"));
    }
}
