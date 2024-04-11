import java.util.List;
import java.util.Scanner;

public class ManageCar implements ManageVehicules<Car>{
    Scanner sc=new Scanner(System.in);
    @Override
    public Car CreateVehicule(List<Car> list) {
        System.out.println("give me the model ");
        String model=sc.next();
        System.out.println("give me the maker");
        String make=sc.next();
        System.out.println("give me the Matricule");
        String Matricule=sc.next();
        System.out.println("give me the NumberOfDoors");
        int NumberOfDoors=sc.nextInt();
        System.out.println("give me the FuelType");
        String FuelType=sc.next();
        Car car =new Car(model,make,Matricule,NumberOfDoors,FuelType);
        list.add(car);
        return car;
    }



    @Override
    public void GetAllVehicules(List<Car> list) {
        for(Car element:list) {
            System.out.println(element);
        }

    }
}
