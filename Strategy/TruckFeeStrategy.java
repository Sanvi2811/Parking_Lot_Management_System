package Strategy;

public class TruckFeeStrategy implements FeeStrategy{

    @Override
    public double feecalculate(double Duration) {
      return 30*Duration;
    }
    
}
