public class ElectricCar extends Vehicule{
    private double BatteryCapacity;
    private double ChargingTime;

    public ElectricCar(String model, String make, String vehicleIdentificationNumber, double batteryCapacity, double chargingTime) {
        super(model, make, vehicleIdentificationNumber);
        BatteryCapacity = batteryCapacity;
        ChargingTime = chargingTime;
    }

    public double getBatteryCapacity() {
        return BatteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        BatteryCapacity = batteryCapacity;
    }

    public double getChargingTime() {
        return ChargingTime;
    }

    public void setChargingTime(double chargingTime) {
        ChargingTime = chargingTime;
    }
    public String toString() {
        return "car{" +
                "Model='" + this.getModel() + '\'' +
                ", Make='" + this.getMake()+ '\'' +
                ", VehicleIdentificationNumber='" + this.getVehicleIdentificationNumber() + '\'' +
                ", BatteryCapacity='"+BatteryCapacity+'\''+
                ", ChargingTime='"+ChargingTime+'\''+
                '}';
    }
}
