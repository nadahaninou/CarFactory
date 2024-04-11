public class SportCar extends Vehicule{
    private double TopSpeed;
    private double Acceleration;

    public SportCar(String model, String make, String vehicleIdentificationNumber, double topSpeed, double acceleration) {
        super(model, make, vehicleIdentificationNumber);
        TopSpeed = topSpeed;
        Acceleration = acceleration;
    }

    public double getTopSpeed() {
        return TopSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        TopSpeed = topSpeed;
    }

    public double getAcceleration() {
        return Acceleration;
    }

    public void setAcceleration(double acceleration) {
        Acceleration = acceleration;
    }
    public String toString() {
        return "car{" +
                "Model='" + this.getModel() + '\'' +
                ", Make='" + this.getMake()+ '\'' +
                ", VehicleIdentificationNumber='" + this.getVehicleIdentificationNumber() + '\'' +
                ", TopSpeed='"+TopSpeed+'\''+
                ", Acceleration='"+Acceleration+'\''+
                '}';
    }
}
