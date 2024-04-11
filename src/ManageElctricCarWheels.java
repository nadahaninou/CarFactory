import java.util.List;
import java.util.Scanner;

public class ManageElctricCarWheels implements ManageWheels<ElectricCarWheel>{
    Scanner sc=new Scanner(System.in);
    @Override
    public ElectricCarWheel CreateWheel(List<ElectricCarWheel> list) {
        System.out.println("give me the size");
        int size=sc.nextInt();
        System.out.println("give me the material");
        String Material=sc.next();
        System.out.println("give me the batteryCapacity");
        double batteryCapacity=sc.nextDouble();
        ElectricCarWheel electricCarWheel=new ElectricCarWheel(size,Material,batteryCapacity);
        list.add(electricCarWheel);

        return electricCarWheel;
    }

    @Override
    public void GetAllWheels(List<ElectricCarWheel> list) {
        for(ElectricCarWheel element:list) {
            System.out.println(element);
        }
    }
}
