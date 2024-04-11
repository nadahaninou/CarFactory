public class Vehicule {
    private String Model;
    private String Make;
    private String VehicleIdentificationNumber;

    public Vehicule(String model, String make, String vehicleIdentificationNumber) {
        Model = model;
        Make = make;
        VehicleIdentificationNumber = vehicleIdentificationNumber;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public String getVehicleIdentificationNumber() {
        return VehicleIdentificationNumber;
    }

    public void setVehicleIdentificationNumber(String vehicleIdentificationNumber) {
        VehicleIdentificationNumber = vehicleIdentificationNumber;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "Model='" + Model + '\'' +
                ", Make='" + Make + '\'' +
                ", VehicleIdentificationNumber='" + VehicleIdentificationNumber + '\'' +
                '}';
    }
}
