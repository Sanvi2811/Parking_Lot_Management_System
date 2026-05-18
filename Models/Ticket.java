package Models;

import java.time.LocalDateTime;

public class Ticket {
    private int TicketID;
    private Vehicle vehicle;
    private ParkingSlot parkingslot;
    private LocalDateTime entrytime;
    private LocalDateTime exitTime;
    private double parkingfee = 0.0;
    public Ticket(int TicketId, Vehicle vehicle, ParkingSlot parkingslot,LocalDateTime entrytime){
        this.TicketID = TicketId;
        this.vehicle = vehicle;
        this.parkingslot = parkingslot;
        this.entrytime = entrytime;
    }
    public int getTicketId() {
        return this.TicketID;
    }
    public Vehicle getVehicle() {
        return this.vehicle;
    }
    public ParkingSlot getParkingSlot() {
        return this.parkingslot;
    }
    public LocalDateTime getEntryTime() {
        return this.entrytime;
    }
    public LocalDateTime getExitTime() {
        return this.exitTime;
    }
    public double getParkingFee() {
        return this.parkingfee;
    }
    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }
    public void setParkingFee(double parkingFee) {
        this.parkingfee = parkingFee;
    }
}
