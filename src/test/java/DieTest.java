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
    @Test
    public void rollGivesRandomNumberTest() {
        //Given
        Integer sides = 6;
        Die die = new Die(sides);
        Integer roll = die.roll();
        Assert.assertTrue(roll >= 1);
        Assert.assertTrue(roll <= sides);
    }
    @Test
    public void storesLastRollTest() {
        //Given
        Integer sides = 6;
        Die die = new Die(sides);
        Integer roll = die.roll();
        Assert.assertEquals(roll, die.getLastRoll());
    }
}
