import java.util.List;
import java.util.Scanner;

public class ManageSportCarWheels implements ManageWheels<SportCarWheel>{
    Scanner sc=new Scanner(System.in);
    @Override
    public SportCarWheel CreateWheel(List<SportCarWheel> list) {
        System.out.println("give me the size");
        int size=sc.nextInt();
        System.out.println("give me the material");
        String Material=sc.next();
        System.out.println("give me the performance");
        double performancee=sc.nextDouble();
        SportCarWheel sportCarWheel=new SportCarWheel(size,Material,performancee);
        list.add(sportCarWheel);

        return sportCarWheel;
    }

    @Override
    public void GetAllWheels(List<SportCarWheel> list) {
        for(SportCarWheel element:list) {
            System.out.println(element);
        }
    }
}
