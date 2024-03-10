import org.junit.Assert;
import org.junit.Test;
public class DieTest {
    @Test
    public void setSidesTest() {
        //Given
        Integer sides = 6;
        Die die = new Die(sides);
        Assert.assertEquals(sides, die.getSides());
    }
}
