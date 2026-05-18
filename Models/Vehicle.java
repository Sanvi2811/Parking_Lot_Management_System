package Models;

public  abstract class Vehicle{
   private  String VehicleNumber;
    private String VehicleType;

    public Vehicle(String VehicleNumber, String VehicleType){
        this.VehicleNumber = VehicleNumber;
        this.VehicleType = VehicleType;
    }

    public void setVehicleNumber(String VehicleNumber){
        this.VehicleNumber = VehicleNumber;
    }
    public String getVehicleNumber(){
        return VehicleNumber;
    }
    public void setVehicleType(String VehicleType){
        this.VehicleType = VehicleType;
    }
    public String getVehicleType(){
        return VehicleType;
    }
}

