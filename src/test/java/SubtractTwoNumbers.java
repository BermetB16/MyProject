import org.junit.Assert;
import org.junit.Test;

public class SubtractTwoNumbers {

    public int add(int a, int b) {
        return a - b;
    }

    @Test
    public void testAdd() {
        edabit.SubtractTwoNumbers obj = new edabit.SubtractTwoNumbers();
        // actual result,           // expected
        Assert.assertEquals(obj.add(5, 2), 3);
    }
}
