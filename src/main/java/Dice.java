import java.util.ArrayList;
import java.util.List;

public class Dice {

    private Integer sides = 6; //Defaults to 6 but can be changed
    private List<Die> cupOfDice;
    public Dice(Integer numberOfDice){
        cupOfDice = new ArrayList<>();
        for(int i = 0; i < numberOfDice; i++){
            Die die = new Die(this.sides);
            cupOfDice.add(die);
        }
    }
    public Dice(Integer numberOfDice, Integer sides){
        cupOfDice = new ArrayList<>();
        this.sides = sides;
        for(int i = 0; i < numberOfDice; i++){
            Die die = new Die(sides);
            cupOfDice.add(die);
        }
    }
    public Integer tossAndSum(){
        Integer sum = 0;
        for( Die oneCube : cupOfDice){
            Integer result = oneCube.roll();
            sum += result;
        }
        return sum;
    }
    public Integer getNumberOfDice(){
        return this.cupOfDice.size();
    }
    public Integer getSides(){
        return this.sides;
    }


}
