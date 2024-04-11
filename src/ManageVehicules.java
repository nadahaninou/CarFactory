import java.util.List;

public interface ManageVehicules<T extends Vehicule> {
    public T CreateVehicule(List<T> list);

    public void GetAllVehicules(List<T> list);
}
