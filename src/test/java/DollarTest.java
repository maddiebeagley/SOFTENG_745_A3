import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DollarTest {

    @Test
    public void testDollarDivision() {
        System.out.println("Running first test");
        Dollar ten = new Dollar(10);
        Dollar result = ten.dividedBy(2);
        assertEquals(new Dollar(5), result); // You could change 5 to 4 to see the build failure
    }

    @Test(expected=ArithmeticException.class)
    public void testDollarDividedByZero() {
        System.out.println("Running second test");
        Dollar ten = new Dollar(10);
        ten.dividedBy(0);
    }
}