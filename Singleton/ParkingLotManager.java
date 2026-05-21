package Singleton;


public class ParkingLotManager {
    private static ParkingLotManager instance = null;
    private  ParkingLotManager(){};

    public final synchronized ParkingLotManager CreateParkingLotManager(){
        if(instance == null){
            instance = new ParkingLotManager();
        }
        return instance;
    }

}
