public class Car extends Vehicule{
    private int NumberOfDoors;
    private String FuelType;

    public Car(String model, String make, String vehicleIdentificationNumber, int numberOfDoors, String fuelType) {
        super(model, make, vehicleIdentificationNumber);
        NumberOfDoors = numberOfDoors;
        FuelType = fuelType;
    }

    public int getNumberOfDoors() {
        return NumberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        NumberOfDoors = numberOfDoors;
    }

    public String getFuelType() {
        return FuelType;
    }

    public void setFuelType(String fuelType) {
        FuelType = fuelType;
    }

    public String toString() {
        return "car{" +
                "Model='" + this.getModel() + '\'' +
                ", Make='" + this.getMake()+ '\'' +
                ", VehicleIdentificationNumber='" + this.getVehicleIdentificationNumber() + '\'' +
                ", NumberOfDoors='"+NumberOfDoors+'\''+
                ", FuelType='"+FuelType+'\''+
                '}';
    }
}
