import org.junit.Assert;
import org.junit.Test;
public class DiceTest {
    @Test
    public void tossAndSumGivesFairNumTest() {
        //Given
        Integer numberOfDice = 2;
        Dice cupOfDice = new Dice(numberOfDice);
        Integer total = cupOfDice.tossAndSum();
        Assert.assertTrue(total >= 2);
        Assert.assertTrue(total <= 12);
    }
}
