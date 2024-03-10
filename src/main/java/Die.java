import java.util.Random;

public class Die {
    private Integer sides;
    private Integer lastRoll;

    public Die(Integer sides){
        this.sides = sides;
    }

    public Integer getSides(){
        return this.sides;
    }

    public Integer getLastRoll(){
        return this.lastRoll;
    }



    public Integer roll(){
        int dieRoll;
        dieRoll = new Random().nextInt(sides) + 1;
        lastRoll = dieRoll;
        return dieRoll;
    }
}
