public class Wheel {
    private int size;
    private String Material;

    public Wheel(int size, String material) {
        this.size = size;
        Material = material;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String material) {
        Material = material;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "size=" + size +
                ", Material='" + Material + '\'' +
                '}';
    }
}
