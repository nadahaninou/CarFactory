public class CarWheel extends Wheel{
    private String Type;

    public CarWheel(int size, String material, String type) {
        super(size, material);
        Type = type;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
    public String toString() {
        return "CarWheel{" +
                "size=" + this.getSize() +
                ", Material='" + this.getMaterial() + '\'' +
                " ,Type='"+Type+'\''+
                '}';
    }
}
