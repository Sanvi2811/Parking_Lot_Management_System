package Factory;

import Models.Bike;
import Models.Car;
import Models.Truck;
import Models.Vehicle;

public class VehicleFactory{
    public Vehicle create(String VehicleNumber,String VehicleType){
      if(VehicleType.toUpperCase().equals("CAR")){
        return new Car(VehicleNumber, VehicleType);
      } else if(VehicleType.toUpperCase().equals("BIKE")){
        return new Bike(VehicleNumber, VehicleType);
      }else if(VehicleType.toUpperCase().equals("TRUCK")) {
        return new Truck(VehicleNumber, VehicleType);
      }
      return null;
    }
}