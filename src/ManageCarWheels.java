import java.util.List;
import java.util.Scanner;

public class ManageCarWheels implements ManageWheels<CarWheel>{
Scanner sc=new Scanner(System.in);
    @Override
    public CarWheel CreateWheel(List<CarWheel> list) {
        System.out.println("give me the size");
        int size=sc.nextInt();
        System.out.println("give me the material");
        String Material=sc.next();
        System.out.println("give me the type");
        String type=sc.next();
        CarWheel carWheel=new CarWheel(size,Material,type);
        list.add(carWheel);

        return carWheel;
    }

    @Override
    public void GetAllWheels(List<CarWheel> list) {
        for(CarWheel element:list) {
            System.out.println(element);
        }
    }
}
