public class ElectricCarWheel extends Wheel{
    private double batteryCapacity;

    public ElectricCarWheel(int size, String material, double batteryCapacity) {
        super(size, material);
        this.batteryCapacity = batteryCapacity;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
    public String toString() {
        return "Wheel{" +
                "size=" + this.getSize() +
                ", Material='" + this.getMaterial() + '\'' +
                ", batteryCapacity='"+this.getBatteryCapacity()+'\''+
                '}';
    }
}
