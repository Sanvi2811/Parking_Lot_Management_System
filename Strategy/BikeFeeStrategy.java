package Strategy;

public class BikeFeeStrategy implements FeeStrategy {

    @Override
    public double feecalculate(double Duration) {
       return 10*Duration;
    }
    
}
