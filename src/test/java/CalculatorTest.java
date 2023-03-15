import lv.acodemy.classroom.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;
@Test
public class CalculatorTest {
    Calculator casio = new Calculator();
    public void testSum() {
        Assert.assertEquals(casio.sum(10, 50), 60);
    }

    public void testMultiply() {
        Assert.assertEquals(casio.multiply(10, 5), 50);
    }

    public void testDivide() {
        Assert.assertEquals(casio.divide(10, 5), 2);
    }

    public void testSubtract() {
        Assert.assertEquals(casio.subtract(10, 5), 5);
    }
}
