package Models;

public class ParkingSlot {
    private int SlotID;
    private boolean isOccupied = false;
    private Vehicle parkedVehicle = null;

    public ParkingSlot(int SlotID){
        this.SlotID = SlotID;
    }

    public void parkVehicle(Vehicle v1){
        this.parkedVehicle = v1;
        this.isOccupied = true;
    }
    public void removeVehicle(){
        this.parkedVehicle = null;
        this.isOccupied = false;
    }
    public boolean isAvailable(){
        if(this.isOccupied){
            return false;
        }else{
            return true;
        }
    }
    public int getSlotId(){
        return this.SlotID;
    }
    public Vehicle getVehicle(){
        return this.parkedVehicle;
    }
    public boolean isOccupied(){
        return this.isOccupied;
    }


}
