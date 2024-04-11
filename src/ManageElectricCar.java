import java.util.List;
import java.util.Scanner;

public class ManageElectricCar implements ManageVehicules<ElectricCar>{
    Scanner sc=new Scanner(System.in);
    @Override
    public ElectricCar CreateVehicule(List<ElectricCar> list) {
        System.out.println("give me the model ");
        String model=sc.next();
        System.out.println("give me the maker");
        String make=sc.next();
        System.out.println("give me the Matricule");
        String Matricule=sc.next();
        System.out.println("give me the BatteryCapacity");
        double BatteryCapacity=sc.nextDouble();
        System.out.println("give me the ChargingTime");
        double ChargingTime=sc.nextDouble();
        ElectricCar electricCar =new ElectricCar(model,make,Matricule,BatteryCapacity,ChargingTime);
        list.add(electricCar);
        return electricCar;

    }

    @Override
    public void GetAllVehicules(List<ElectricCar> list) {
        for(ElectricCar element:list) {
            System.out.println(element);
        }
    }
}
