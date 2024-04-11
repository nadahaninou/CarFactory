public class SportCarWheel extends Wheel{
    private double performance;

    public SportCarWheel(int size, String material, double performance) {
        super(size, material);
        this.performance = performance;
    }

    public double getPerformance() {
        return performance;
    }

    public void setPerformance(double performance) {
        this.performance = performance;
    }
    public String toString() {
        return "Wheel{" +
                "size=" + this.getSize() +
                ", Material='" + this.getMaterial() + '\'' +
                ",performance"+ this.getPerformance()+'\''+
                '}';
    }
}
