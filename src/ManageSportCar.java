import java.util.List;
import java.util.Scanner;

public class ManageSportCar implements ManageVehicules<SportCar>{
Scanner sc=new Scanner(System.in);
    @Override
    public SportCar CreateVehicule(List<SportCar> list) {
        System.out.println("give me the model ");
        String model=sc.next();
        System.out.println("give me the maker");
        String make=sc.next();
        System.out.println("give me the Matricule");
        String Matricule=sc.next();
        System.out.println("give me the TopSpeed");
        double TopSpeed=sc.nextDouble();
        System.out.println("give me the Acceleration");
        double Acceleration=sc.nextDouble();
        SportCar sportCar =new SportCar(model,make,Matricule,TopSpeed,Acceleration);
        list.add(sportCar);
        return sportCar;
    }

    @Override
    public void GetAllVehicules(List<SportCar> list) {
        for(SportCar element:list) {
            System.out.println(element);
        }
    }
}
