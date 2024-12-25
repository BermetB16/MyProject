import edabit.SumTwoNumbers;
import org.junit.Assert;
import org.junit.Test;

public class SumNumbers {
    public int add(int a, int b) {
        return a + b;
    }

    @Test
    public void testAdd() {
        SumTwoNumbers obj = new SumTwoNumbers();
        // actual result,           // expected
        Assert.assertEquals(obj.add(1, 2), 3);

        // hi
    }
}
