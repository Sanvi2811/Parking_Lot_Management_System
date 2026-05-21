package Strategy;

public class CarFeeStrategy  implements FeeStrategy{

    @Override
    public double feecalculate(double Duration) {
        return 20*Duration;
    }
    
}
