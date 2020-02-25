import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public  void addTest(){
        Assert.assertEquals(Calculator.add(1,2,3,4,5), 15);
        Assert.assertEquals(Calculator.add(1,2),3);
        Assert.assertEquals(Calculator.add(-1,-1),-2);

    }
    @Test
    public void multiplyTest(){
        Assert.assertEquals(Calculator.multiply(1,2,3,4,5),120);
        Assert.assertEquals(Calculator.multiply(1,3),3);
        Assert.assertEquals(Calculator.multiply(1,-3),-3);

    }
}
