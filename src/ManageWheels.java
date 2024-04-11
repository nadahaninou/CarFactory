import java.util.List;

public interface ManageWheels<T extends Wheel> {
    public T CreateWheel(List<T> list);
    public void GetAllWheels(List<T> list);
}
