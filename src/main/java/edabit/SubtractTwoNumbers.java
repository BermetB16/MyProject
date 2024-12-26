package edabit;

import org.junit.Assert;
import org.junit.Test;

public class SubtractTwoNumbers {
    public int add(int a, int b) {
        return a - b;
    }

    @Test
    public void testAdd() {
        SubtractTwoNumbers obj = new SubtractTwoNumbers();
        // actual result,           // expected
        Assert.assertEquals(obj.add(5, 2), 3);
    }

}

