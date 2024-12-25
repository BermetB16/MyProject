package edabit;

import com.sun.tools.javac.Main;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.processing.SupportedAnnotationTypes;

public class SumTwoNumbers {

    public int add(int a, int b) {
        return a + b;
    }

    @Test
    public void testAdd() {
        SumTwoNumbers obj = new SumTwoNumbers();
        // actual result,           // expected
        Assert.assertEquals(obj.add(1, 2), 3);
        Assert.assertEquals(obj.add(100, 200), 300.0);
    }
}
